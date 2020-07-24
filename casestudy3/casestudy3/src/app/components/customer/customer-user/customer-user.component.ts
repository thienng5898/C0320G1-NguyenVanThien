import { Component, OnInit } from '@angular/core';
import {ICustomer} from '../../../models/customer';
import {ContractService} from '../../../services/contract.service';
import {CustomerService} from '../../../services/customer.service';
import {FacilityService} from '../../../services/facility.service';
import {IService} from '../../../models/facility';

@Component({
  selector: 'app-customer-user',
  templateUrl: './customer-user.component.html',
  styleUrls: ['./customer-user.component.css']
})
export class CustomerUserComponent implements OnInit {
customerList: ICustomer[] = [] ;
facilityList: IService[] = [] ;
  term: string;
  p = 1;
  constructor(private contractService: ContractService,
              private customerService: CustomerService,
              private facilityService: FacilityService) { }

  ngOnInit() {
    this.contractService.getAllContracts().subscribe(
      data => {
        data.forEach(hopdong => {
          this.customerService.getCustomerByIdCustomer(hopdong.id_customer).subscribe(
            dataCustomer => {
              this.customerList.push(dataCustomer[0]);
            }
          );
        }) ;
        data.forEach(hopdong => {
          this.facilityService.getServiceByIdService(hopdong.id_service).subscribe(dataService => {
            this.facilityList.push(dataService[0]);
          });
        });
      }
    );
  }

}
