import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {ICustomer} from '../models/customer';
import {HttpClient, HttpHeaders} from '@angular/common/http';




@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private readonly API = ' http://localhost:3000/customers' ;

  constructor(public http: HttpClient) { }
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  getAllCustomers(): Observable<ICustomer[]> {
    return this.http.get<ICustomer[]>(this.API);
  }
  addCustomer(customer: ICustomer): Observable<ICustomer> {
    return this.http.post<ICustomer>(this.API, JSON.stringify(customer), this.httpOptions);
  }

  getCustomerById(customerId): Observable<ICustomer> {
    return this.http.get<ICustomer>(this.API + '/' + customerId);
  }

  deleteCustomer(customerId): Observable<ICustomer> {
    return this.http.delete<ICustomer>(this.API + '/' + customerId);
  }

  editCustomer(customer, customerId): Observable<ICustomer> {
    return this.http.put<ICustomer>(this.API + '/' + customerId, customer) ;
  }
  getCustomerByIdCustomer(customerId): Observable<ICustomer> {
    return this.http.get<ICustomer>(this.API + '?id_customer=' + customerId);
  }
}
