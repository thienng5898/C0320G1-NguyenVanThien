import {Injectable} from '@angular/core';
import {IService} from '../models/facility';

import {Observable, of} from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class FacilityService {

  private readonly API = ' http://localhost:3000/facilities' ;

  constructor(public http: HttpClient) { }
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  getAllServices(): Observable< IService[]> {
    return this.http.get<IService[]>(this.API);
  }

  addService(service: IService): Observable<IService> {
    return this.http.post<IService>(this.API, JSON.stringify(service), this.httpOptions);
  }

  getServiceById(serviceId): Observable<IService> {
    return this.http.get<IService>(this.API + '/' + serviceId);
  }

  deleteService(serviceId): Observable<IService> {
    return this.http.delete<IService>(this.API + '/' + serviceId);
  }

  editService(service, serviceId): Observable<IService> {
    return this.http.put<IService>(this.API + '/' + serviceId, service) ;
  }
}
