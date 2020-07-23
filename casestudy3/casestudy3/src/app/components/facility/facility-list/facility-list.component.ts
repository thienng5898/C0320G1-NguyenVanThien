import { Component, OnInit } from '@angular/core';
import {FacilityService} from '../../../services/facility.service';
import {IService} from "../../../models/facility";

@Component({
  selector: 'app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {
  services: IService[] ;
  term: string;
  p = 1;
  constructor(private facilityService: FacilityService) { }

  ngOnInit() {
    this.facilityService.getAllServices().subscribe(services => this.services = services).unsubscribe() ;
  }

}
