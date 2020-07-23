import {Injectable} from '@angular/core';
import {IService} from '../models/facility';

import {Observable, of} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  private services: IService[] = [
    {
      id: 1,
      id_service: 'DV-1524',
      name: 'King',
      area: 50,
      number_floor: 2,
      number_max_people: 4,
      type_rent: 'Ngày',
      total_rent: 800000,
      status: 'sẵn sàng',
    },    {
      id: 2,
      id_service: 'DV-1224',
      name: 'Queen',
      area: 50,
      number_floor: 1,
      number_max_people: 3,
      type_rent: 'Ngày',
      total_rent: 800000,
      status: 'sẵn sàng',
    },    {
      id: 3,
      id_service: 'DV-5424',
      name: 'MonKey',
      area: 20,
      number_floor: 2,
      number_max_people: 4,
      type_rent: 'Ngày',
      total_rent: 200000,
      status: 'sẵn sàng',
    },    {
      id: 4,
      id_service: 'DV-1524',
      name: 'Sakura',
      area: 10,
      number_floor: 2,
      number_max_people: 4,
      type_rent: 'Ngày',
      total_rent: 200000,
      status: 'sẵn sàng',
    },    {
      id: 5,
      id_service: 'DV-3124',
      name: 'Kabuto',
      area: 50,
      number_floor: 2,
      number_max_people: 4,
      type_rent: 'Ngày',
      total_rent: 800000,
      status: 'sẵn sàng',
    },    {
      id: 6,
      id_service: 'DV-5224',
      name: 'Kiva',
      area: 50,
      number_floor: 2,
      number_max_people: 4,
      type_rent: 'Giờ',
      total_rent: 800000,
      status: 'sẵn sàng',
    },    {
      id: 8,
      id_service: 'DV-3724',
      name: 'Viper',
      area: 50,
      number_floor: 2,
      number_max_people: 4,
      type_rent: 'Giờ',
      total_rent: 800000,
      status: 'sẵn sàng',
    },    {
      id: 9,
      id_service: 'DV-1241',
      name: 'Lion',
      area: 50,
      number_floor: 2,
      number_max_people: 4,
      type_rent: 'Giờ',
      total_rent: 1000000,
      status: 'Bận',
    }
  ];

  constructor() {
  }
  addService(service: IService) {
    this.services.push(service);
  }

  getAllServices(): Observable<IService[]> {
    return of (this.services);
  }

}
