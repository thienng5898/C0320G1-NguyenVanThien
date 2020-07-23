import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {EmployeeService} from '../../../services/employee.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  employeeEditForm: FormGroup;
  maxDate = new Date();
  minDate = new Date(1800, 0, 1) ;
  private employeeId ;
  constructor(private fb: FormBuilder,
              @Inject(MAT_DIALOG_DATA) private data: any,
              private employeeService: EmployeeService,
              private dialogRef: MatDialogRef<EmployeeEditComponent>) { }

  ngOnInit() {
    this.employeeEditForm = this.fb.group({
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

    this.employeeId = this.data.data1.id ;
    this.employeeEditForm.patchValue(this.data.data1);
  }

  onSubmit() {
    this.employeeService.editEmployee(this.employeeEditForm.value, this.employeeId).subscribe((next) => {
        this.dialogRef.close();
      }
    );
  }
}
