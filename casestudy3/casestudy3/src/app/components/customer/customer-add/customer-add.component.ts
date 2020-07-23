import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../services/customer.service';
import { MatDialogRef} from '@angular/material/dialog';


@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit {
  customerForm: FormGroup;
  maxDate = new Date();
  minDate = new Date(1800, 0, 1) ;

  constructor(private customerService: CustomerService,
              private fb: FormBuilder,
              private dialogRef: MatDialogRef<CustomerAddComponent>) {
  }

  ngOnInit() {
    this.customerForm = this.fb.group({
      id_customer: ['', [Validators.required, Validators.pattern(/^KH-[0-9]{4}$/)]],
      name: ['', Validators.required],
      type_customer: ['', Validators.required],
      birthday: ['', Validators.required],
      id_card: ['', [Validators.required, Validators.pattern(/(^[0-9]{9}$)|(^[0-9]{12}$)/)]],
      phone: ['', [Validators.required, Validators.pattern(/(^09[0|1][0-9]{7}$)|(^[(]84[)][+]9[0|1][0-9]{7}$)/)]],
      email: ['', [Validators.required , Validators.email]],
      address: ['', Validators.required]
    });
  }
  onSubmit() {
   this.customerService.addCustomer(this.customerForm.value).subscribe(() => {
     this.dialogRef.close();
   } );
  }
}
