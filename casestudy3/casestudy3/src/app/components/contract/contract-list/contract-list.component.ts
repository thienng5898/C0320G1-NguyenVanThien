import { Component, OnInit } from '@angular/core';
import {IContract} from '../../../models/contract';
import {ContractService} from '../../../services/contract.service';
import {MatDialog} from '@angular/material/dialog';
import {ContractAddComponent} from '../contract-add/contract-add.component';
import {ContractDeleteComponent} from '../contract-delete/contract-delete.component';

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {
  contracts: IContract[] ;
  term: string;
  p = 1;
  constructor(private contractService: ContractService,
              private dialog: MatDialog) { }

  ngOnInit() {
    this.contractService.getAllContracts().subscribe(data => {
        this.contracts = data;
      }
    );
  }

  openDialogAdd() {
    const dialogRef = this.dialog.open(ContractAddComponent, {
      width: '750px',
      height: '1000px'
    });

    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  }

  openDialogDelete(contractId): void {
    this.contractService.getContractById(contractId).subscribe(contractData => {
        const dialogRef = this.dialog.open(ContractDeleteComponent, {
          width: '500px',
          data: {data1: contractData},
        });
        dialogRef.afterClosed().subscribe(result => {
          this.ngOnInit() ;
        });
      }
    );
  }
}
