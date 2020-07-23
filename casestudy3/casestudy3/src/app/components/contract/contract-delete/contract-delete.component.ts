import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {EmployeeService} from "../../../services/employee.service";
import {ContractService} from "../../../services/contract.service";

@Component({
  selector: 'app-contract-delete',
  templateUrl: './contract-delete.component.html',
  styleUrls: ['./contract-delete.component.css']
})
export class ContractDeleteComponent implements OnInit {
private contractId;
  constructor(private dialogRef: MatDialogRef<ContractDeleteComponent>,
              @Inject(MAT_DIALOG_DATA) private data: any,
              private contractService: ContractService) { }

  ngOnInit() {
    this.contractId = this.data.data1.id ;
  }
  deleteContract() {
    this.contractService.deleteContract(this.contractId).subscribe(data => {
      this.dialogRef.close();
    });

  }
}
