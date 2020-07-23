import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {HttpClientModule} from '@angular/common/http';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {EmployeeListComponent} from './components/employees/employee-list/employee-list.component';
import {EmployeeAddComponent} from './components/employees/employee-add/employee-add.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {CustomerAddComponent} from './components/customer/customer-add/customer-add.component';
import {FacilityListComponent} from './components/facility/facility-list/facility-list.component';
import {FacilityAddComponent} from './components/facility/facility-add/facility-add.component';
import {HomeComponent} from './components/home/home.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {MaterialModule} from './material.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { EmployeeDeleteComponent } from './components/employees/employee-delete/employee-delete.component';
import {EmployeeEditComponent} from './components/employees/employee-edit/employee-edit.component';
import { CustomerDeleteComponent } from './components/customer/customer-delete/customer-delete.component';
import { CustomerEditComponent } from './components/customer/customer-edit/customer-edit.component';
import { FacilityDeleteComponent } from './components/facility/facility-delete/facility-delete.component';
import { FacilityEditComponent } from './components/facility/facility-edit/facility-edit.component';
import { ContractAddComponent } from './components/contract/contract-add/contract-add.component';
import { ContractListComponent } from './components/contract/contract-list/contract-list.component';
import { ContractDeleteComponent } from './components/contract/contract-delete/contract-delete.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    EmployeeAddComponent,
    CustomerListComponent,
    CustomerAddComponent,
    FacilityListComponent,
    FacilityAddComponent,
    HomeComponent,
    PageNotFoundComponent,
    EmployeeDeleteComponent,
    EmployeeEditComponent,
    CustomerDeleteComponent,
    CustomerEditComponent,
    FacilityDeleteComponent,
    FacilityEditComponent,
    ContractAddComponent,
    ContractListComponent,
    ContractDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    HttpClientModule,
    MaterialModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
