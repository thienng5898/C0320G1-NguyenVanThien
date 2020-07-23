import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {EmployeeService} from '../../../services/employee.service';
import {MatDialogRef} from '@angular/material/dialog';


@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  employeeForm: FormGroup;
  maxDate = new Date();
  minDate = new Date(1800, 0, 1) ;

  constructor(private fb: FormBuilder,
              private employeeService: EmployeeService,
              private dialogRef: MatDialogRef<EmployeeAddComponent>
              ) {
  }

  ngOnInit() {
    this.employeeForm = this.fb.group({
      id_employee: ['', [Validators.required, Validators.pattern(/^NV-[0-9]{4}$/)]],
      name: ['', Validators.required],
      birthday: ['', Validators.required],
      id_card: ['', [Validators.required, Validators.pattern(/(^[0-9]{9}$)|(^[0-9]{12}$)/)]],
      phone: ['', [Validators.required, Validators.pattern(/(^09[0|1][0-9]{7}$)|(^[(]84[)][+]9[0|1][0-9]{7}$)/)]],
      email: ['', [Validators.required, Validators.email ]],
      degree: ['', Validators.required],
      position: ['', Validators.required],
      part: ['', Validators.required],
      salary: ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]]
    });
  }

  onSubmit() {
    this.employeeService.addEmployee(this.employeeForm.value).subscribe(() => {
      this.dialogRef.close();
      }
    );
  }
}
