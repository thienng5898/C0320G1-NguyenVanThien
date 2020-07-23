import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {FacilityService} from '../../../services/facility.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';


@Component({
  selector: 'app-facility-edit',
  templateUrl: './facility-edit.component.html',
  styleUrls: ['./facility-edit.component.css']
})
export class FacilityEditComponent implements OnInit {
  serviceEditForm: FormGroup ;
  private serviceId ;
  constructor(private facilityService: FacilityService, private fb: FormBuilder,
              @Inject(MAT_DIALOG_DATA) private data: any,
              private dialogRef: MatDialogRef<FacilityEditComponent>) {
  }

  ngOnInit() {
    this.serviceEditForm = this.fb.group({
      id_service: ['', [Validators.required, Validators.pattern(/^DV-[0-9]{4}$/)]],
      name: ['', Validators.required],
      area: ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]],
      number_floor:  ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]],
      number_max_people: ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]],
      type_rent:  ['', Validators.required],
      total_rent: ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]],
      status: ['', Validators.required],
    });

    this.serviceId = this.data.data1.id ;
    this.serviceEditForm.patchValue(this.data.data1);
  }


  onSubmit() {
    this.facilityService.editService(this.serviceEditForm.value, this.serviceId).subscribe(() => {
        this.dialogRef.close();
      }
    );
  }

}
