import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {EmployeeListComponent} from './components/employees/employee-list/employee-list.component';

import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';

import {FacilityListComponent} from './components/facility/facility-list/facility-list.component';

import {HomeComponent} from './components/home/home.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';

import {ReactiveFormsModule} from '@angular/forms';
import {MaterialModule} from './material.module';



const routes: Routes = [{path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'facility-list', component: FacilityListComponent},





  {path: '**', component: PageNotFoundComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes), ReactiveFormsModule, MaterialModule],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
