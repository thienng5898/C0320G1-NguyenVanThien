import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../../../services/employee.service';
import {IEmployee} from '../../../models/employee';
import {MatDialog} from '@angular/material/dialog';
import {EmployeeAddComponent} from '../employee-add/employee-add.component';
import {EmployeeDeleteComponent} from '../employee-delete/employee-delete.component';
import {EmployeeEditComponent} from '../employee-edit/employee-edit.component';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: IEmployee[];
  term: string;
  p = 1;

  constructor(private employeeService: EmployeeService,
              private dialog: MatDialog) {
  }

  ngOnInit() {
    this.employeeService.getAllEmployees().subscribe(data => {
        this.employees = data;
      }
    );
  }


  openDialogAdd() {
    const dialogRef = this.dialog.open(EmployeeAddComponent, {
      width: '750px',
      height: '1000px'
    });

    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  }

  openDialogDelete(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(employeeData => {
        const dialogRef = this.dialog.open(EmployeeDeleteComponent, {
          width: '500px',
          data: {data1: employeeData},
        });
        dialogRef.afterClosed().subscribe(result => {
          this.ngOnInit() ;
        });
      }
    );
  }

  openDialogEdit(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(employeeData => {
        const dialogRef = this.dialog.open(EmployeeEditComponent, {
          width: '750px',
          height: '1000px',
          data: {data1: employeeData}
        });
        dialogRef.afterClosed().subscribe(result => {
          this.ngOnInit() ;
        });
      }
    );
  }
}
