import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {EmployeeService} from '../../../services/employee.service';

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {
 private employeeName ;
 private employeeId ;
  constructor( private dialogRef: MatDialogRef<EmployeeDeleteComponent>,
               @Inject(MAT_DIALOG_DATA) private data: any,
               private employeeService: EmployeeService) { }

  ngOnInit() {
    this.employeeName = this.data.data1.name ;
    this.employeeId = this.data.data1.id ;
  }


  deleteEmployee() {
    this.employeeService.deleteEmployee(this.employeeId).subscribe(data => {
      this.dialogRef.close();
    });

  }
}
