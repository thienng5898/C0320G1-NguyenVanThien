import { Component, OnInit } from '@angular/core';
import {FacilityService} from '../../../services/facility.service';
import {IService} from '../../../models/facility';
import {MatDialog} from '@angular/material/dialog';
import {FacilityAddComponent} from '../facility-add/facility-add.component';
import {FacilityDeleteComponent} from '../facility-delete/facility-delete.component';
import {FacilityEditComponent} from '../facility-edit/facility-edit.component';

@Component({
  selector: 'app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {
  services: IService[] ;
  term: string;
  p = 1;
  constructor(private facilityService: FacilityService,
              private dialog: MatDialog) { }

  ngOnInit() {
    this.facilityService.getAllServices().subscribe(services =>
      this.services = services) ;
  }
  openDialogAdd() {
    const dialogRef = this.dialog.open(FacilityAddComponent, {
      width: '750px',
      height: '1000px'
    });

    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  }
  openDialogDelete(serviceId): void {
    this.facilityService.getServiceById(serviceId).subscribe(facilityData => {
        const dialogRef = this.dialog.open(FacilityDeleteComponent, {
          width: '500px',
          data: {data1: facilityData},
        });
        dialogRef.afterClosed().subscribe(result => {
          this.ngOnInit() ;
        });
      }
    );
  }

  openDialogEdit(serviceId): void {
    this.facilityService.getServiceById(serviceId).subscribe(facilityData => {
        const dialogRef = this.dialog.open(FacilityEditComponent, {
          width: '750px',
          height: '1000px',
          data: {data1: facilityData}
        });
        dialogRef.afterClosed().subscribe(result => {
          this.ngOnInit() ;
        });
      }
    );
  }
}
