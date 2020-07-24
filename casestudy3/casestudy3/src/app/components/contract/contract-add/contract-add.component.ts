import {Component, EventEmitter, OnInit, Output} from '@angular/core';
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
import {MatDatepickerInputEvent} from '@angular/material/datepicker';

@Component({
  selector: 'app-contract-add',
  templateUrl: './contract-add.component.html',
  styleUrls: ['./contract-add.component.css']
})
export class ContractAddComponent implements OnInit {

  @Output()
  dateChange: EventEmitter<MatDatepickerInputEvent<any>>;
  contractAddForm: FormGroup;
  start = new Date();
  employees: IEmployee[];
  customers: ICustomer[];
  services: IService[];
  startDay: string;
  endDay: string;
  total: number;

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
      }, {validators: [checkDeposit, checkStartDate]}) ;


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

  onChange() {
    const contract = this.contractAddForm.value;
    const idService = contract.id_service;
    if (idService !== '' && contract.ngaybatdau !== '' && contract.ngayketthuc !== '') {
      this.facilityService.getServiceByIdService(idService).subscribe(
        data => {
          const facility = data[0];
          const startDate = new Date(contract.startDate).getTime() / 86400000;
          const endDate = new Date(contract.endDate).getTime() / 86400000;
          const dates = endDate - startDate;
          const tong = facility.total_rent * dates;
          this.contractAddForm.patchValue({
            total: tong
          });
        }
      );
    }
  }

    onSubmit() {
      this.contractService.addContract(this.contractAddForm.value).subscribe(() => {
        this.dialogRef.close();
      });
    }
  }

function

  checkStartDate(formGroup: AbstractControl): ValidationErrors | null {
    const contract: IContract = formGroup.value;
    const endDate = new Date(contract.endDate).getTime();
    const startDate = new Date(contract.startDate).getTime();
    if (startDate > endDate) {
      return {invalidStartDate: true};
    }
    return null;
  }

function checkDeposit(formGroup: AbstractControl): ValidationErrors | null {
  const contract: IContract = formGroup.value;
  const deposit = contract.deposit ;
  const total = contract.total ;
  if (deposit - total >= 0) {
    return {checkDeposit: true};
  }
  return null;
}
