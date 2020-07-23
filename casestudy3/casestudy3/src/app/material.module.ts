import {NgModule} from '@angular/core';

import {
  MatDatepickerModule,
  MatNativeDateModule,
  MatFormFieldModule,
  MatInputModule
} from '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatDialogModule} from '@angular/material/dialog';
import {EmployeeAddComponent} from './components/employees/employee-add/employee-add.component';
import {EmployeeDeleteComponent} from './components/employees/employee-delete/employee-delete.component';
import {EmployeeEditComponent} from './components/employees/employee-edit/employee-edit.component';
import {CustomerAddComponent} from './components/customer/customer-add/customer-add.component';
import {CustomerDeleteComponent} from './components/customer/customer-delete/customer-delete.component';
import {CustomerEditComponent} from './components/customer/customer-edit/customer-edit.component';
import {FacilityAddComponent} from './components/facility/facility-add/facility-add.component';
import {FacilityDeleteComponent} from './components/facility/facility-delete/facility-delete.component';
import {FacilityEditComponent} from './components/facility/facility-edit/facility-edit.component';
import {ContractAddComponent} from './components/contract/contract-add/contract-add.component';
import {ContractDeleteComponent} from './components/contract/contract-delete/contract-delete.component';

@NgModule({
  imports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  exports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  providers: [MatDatepickerModule],
  entryComponents: [EmployeeAddComponent,
    EmployeeDeleteComponent,
    EmployeeEditComponent,
    CustomerAddComponent,
    CustomerDeleteComponent,
    CustomerEditComponent,
    FacilityAddComponent,
    FacilityDeleteComponent,
    FacilityEditComponent,
    ContractAddComponent,
    ContractDeleteComponent]
})

export class MaterialModule {
}
