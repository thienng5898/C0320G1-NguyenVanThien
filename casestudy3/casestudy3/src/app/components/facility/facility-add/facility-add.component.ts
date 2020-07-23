import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {FacilityService} from '../../../services/facility.service';
import {MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-facility-add',
  templateUrl: './facility-add.component.html',
  styleUrls: ['./facility-add.component.css']
})
export class FacilityAddComponent implements OnInit {
formAddService: FormGroup;
  constructor(private fb: FormBuilder,
              private facilityService: FacilityService,
              private dialogRef: MatDialogRef<FacilityAddComponent>) { }

  ngOnInit() {
    this.formAddService = this.fb.group({
      id_service: ['', [Validators.required, Validators.pattern(/^DV-[0-9]{4}$/)]],
      name: ['', Validators.required],
      area: ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]],
      number_floor:  ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]],
      number_max_people: ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]],
      type_rent:  ['', Validators.required],
      total_rent: ['', [Validators.required, Validators.pattern(/(^\d*$)/), Validators.min(0)]],
      status: ['', Validators.required],
    });
  }

  onSubmit() {
    this.facilityService.addService(this.formAddService.value).subscribe(() => {
      this.dialogRef.close();
    } );
  }
}
