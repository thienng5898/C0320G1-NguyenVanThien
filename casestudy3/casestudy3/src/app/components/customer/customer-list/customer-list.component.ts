import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../../services/customer.service';
import {ICustomer} from '../../../models/customer';
import {MatDialog} from '@angular/material/dialog';
import {CustomerAddComponent} from '../customer-add/customer-add.component';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';
import {CustomerEditComponent} from '../customer-edit/customer-edit.component';


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
customers: ICustomer[] ;
  term: string;
  p = 1;

  constructor(private customerService: CustomerService,
              private dialog: MatDialog) { }

  ngOnInit() {
    this.customerService.getAllCustomers().subscribe(data => {
        this.customers = data;
      }
    );
  }

  openDialogAdd() {
    const dialogRef = this.dialog.open(CustomerAddComponent, {
      width: '750px',
      height: '1000px'
    });

    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  }
  openDialogDelete(customerId): void {
    this.customerService.getCustomerById(customerId).subscribe(customerData => {
        const dialogRef = this.dialog.open(CustomerDeleteComponent, {
          width: '500px',
          data: {data1: customerData},
        });
        dialogRef.afterClosed().subscribe(result => {
          this.ngOnInit() ;
        });
      }
    );
  }

  openDialogEdit(customerId): void {
    this.customerService.getCustomerById(customerId).subscribe(customerData => {
        const dialogRef = this.dialog.open(CustomerEditComponent, {
          width: '750px',
          height: '1000px',
          data: {data1: customerData}
        });
        dialogRef.afterClosed().subscribe(result => {
          this.ngOnInit() ;
        });
      }
    );
  }

}
