import {Component, OnInit} from '@angular/core';
import {ContractService} from '../../../services/contract.service';

import {AbstractControl, FormBuilder, FormGroup, ValidationErrors, Validators} from '@angular/forms';
import {IEmployee} from '../../../models/employee';
import {IService} from '../../../models/facility';
import {ICustomer} from '../../../models/customer';
import {EmployeeService} from '../../../services/employee.service';
import {CustomerService} from '../../../services/customer.service';
import {FacilityService} from '../../../services/facility.service';
import {IContract} from '../../../models/contract';
import {MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-contract-add',
  templateUrl: './contract-add.component.html',
  styleUrls: ['./contract-add.component.css']
})
export class ContractAddComponent implements OnInit {
  contractAddForm: FormGroup;
  start = new Date();
  employees: IEmployee[];
  customers: ICustomer[];
  services: IService[];

  constructor(private fb: FormBuilder,
              private employeeService: EmployeeService,
              private customerService: CustomerService,
              private contractService: ContractService,
              private facilityService: FacilityService,
              private dialogRef: MatDialogRef<ContractAddComponent>) {
  }

  ngOnInit() {
    this.contractAddForm = this.fb.group({
      id_employee: ['', Validators.required],
      id_customer: ['', Validators.required],
      id_service: ['', Validators.required],
      startDate: ['', Validators.required],
      endDate: ['', Validators.required],
      deposit: ['', [Validators.required, Validators.min(0)]],
      total: ['', [Validators.required, Validators.min(0)]],
      }, {validator: checkStartDate}
    );

    this.employeeService.getAllEmployees().subscribe(
      data => {
        this.employees = data;
        console.log(this.employees);
      });
    this.customerService.getAllCustomers().subscribe(
      data => {
        this.customers = data;
      });
    this.facilityService.getAllServices().subscribe(
      data => {
        this.services = data;
      });
  }


  onSubmit() {
    this.contractService.addContract(this.contractAddForm.value).subscribe(() => {
      this.dialogRef.close();
    } );
  }
}
function checkStartDate(formGroup: AbstractControl): ValidationErrors | null {
  const contract: IContract = formGroup.value;
  let endDate = new Date(contract.endDate).getTime();
  let startDate = new Date(contract.startDate).getTime();
  if (startDate - endDate > -86400000) {
    return {invalidStartDate: true};
  }
  return null;
}
