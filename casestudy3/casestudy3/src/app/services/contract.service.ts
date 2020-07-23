import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {IContract} from '../models/contract';

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  private readonly API = 'http://localhost:3000/contracts' ;

  constructor(public http: HttpClient) {
  }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  getAllContracts(): Observable<IContract[]> {
    return this.http.get<IContract[]>(this.API);
  }
  addContract(contract: IContract): Observable<IContract> {
    return this.http.post<IContract>(this.API, JSON.stringify(contract), this.httpOptions);
  }

  getContractById(contractId): Observable<IContract> {
    return this.http.get<IContract>(this.API + '/' + contractId);
  }

  deleteContract(contractId): Observable<IContract> {
    return this.http.delete<IContract>(this.API + '/' + contractId);
  }

}
