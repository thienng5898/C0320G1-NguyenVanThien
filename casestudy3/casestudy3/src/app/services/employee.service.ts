import {Injectable} from '@angular/core';
import {Observable, of} from 'rxjs';
import {IEmployee} from '../models/employee';
import {HttpClient, HttpHeaders} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
private readonly API = 'http://localhost:3000/IEmployees' ;

  constructor(public http: HttpClient) { }
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };


  getAllEmployees(): Observable<IEmployee[]> {
    return this.http.get<IEmployee[]>(this.API);
  }

  addEmployee(employee: IEmployee): Observable<IEmployee> {
    return this.http.post<IEmployee>(this.API, JSON.stringify(employee), this.httpOptions);
  }

  getEmployeeById(employeeId): Observable<IEmployee> {
    return this.http.get<IEmployee>(this.API + '/' + employeeId);
  }

  deleteEmployee(employeeId): Observable<IEmployee> {
    return this.http.delete<IEmployee>(this.API + '/' + employeeId);
  }

  editEmployee(employee, employeeId): Observable<IEmployee> {
    return this.http.put<IEmployee>(this.API + '/' + employeeId, employee) ;
  }
}
