import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {FacilityService} from '../../../services/facility.service';

@Component({
  selector: 'app-facility-delete',
  templateUrl: './facility-delete.component.html',
  styleUrls: ['./facility-delete.component.css']
})
export class FacilityDeleteComponent implements OnInit {
  private serviceName;
  private serviceId;

  constructor(private dialogRef: MatDialogRef<FacilityDeleteComponent>,
              @Inject(MAT_DIALOG_DATA) private data: any,
              private facilityService: FacilityService) { }

  ngOnInit() {
    this.serviceName = this.data.data1.name;
    this.serviceId = this.data.data1.id;
  }
  deleteService() {
    this.facilityService.deleteService(this.serviceId).subscribe(data => {
      this.dialogRef.close();
    });

  }
}
