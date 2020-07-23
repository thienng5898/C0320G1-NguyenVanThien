import {Injectable} from '@angular/core';


export interface IContract {
  id: number;
  name_employee: string;
  name_customer: string;
  name_service: string;
  start: string;
  end: string;
  deposit: number;
  amount: number;

}

@Injectable({
  providedIn: 'root'
})
export class ContractService {

  constructor() {
  }
}
