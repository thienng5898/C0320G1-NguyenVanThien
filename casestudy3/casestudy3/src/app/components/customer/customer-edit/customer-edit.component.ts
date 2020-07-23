import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../services/customer.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  customerEditForm: FormGroup;
  maxDate = new Date();
  minDate = new Date(1800, 0, 1) ;
 private customerId;
  constructor(private customerService: CustomerService,
              private fb: FormBuilder,
              @Inject(MAT_DIALOG_DATA) private data: any,
              private dialogRef: MatDialogRef<CustomerEditComponent>) { }

ngOnInit() {
    this.customerEditForm = this.fb.group({
      id_customer: ['', [Validators.required, Validators.pattern(/^KH-[0-9]{4}$/)]],
      name: ['', Validators.required],
      type_customer: ['', Validators.required],
      birthday: ['', Validators.required],
      id_card: ['', [Validators.required, Validators.pattern(/(^[0-9]{9}$)|(^[0-9]{12}$)/)]],
      phone: ['', [Validators.required, Validators.pattern(/(^09[0|1][0-9]{7}$)|(^[(]84[)][+]9[0|1][0-9]{7}$)/)]],
      email: ['', [Validators.required , Validators.email]],
      address: ['', Validators.required]
    });

    this.customerId = this.data.data1.id ;
    this.customerEditForm.patchValue(this.data.data1);
  }

  onSubmit() {
    this.customerService.editCustomer(this.customerEditForm.value, this.customerId).subscribe(() => {
        this.dialogRef.close();
      }
    );
  }
}
