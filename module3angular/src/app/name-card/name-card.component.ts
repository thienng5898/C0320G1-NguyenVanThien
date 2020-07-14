import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-name-card',
  templateUrl: './name-card.component.html',
  styleUrls: ['./name-card.component.css']
})
export class NameCardComponent implements OnInit {

  @Input() cardName = 'riotgames';
  @Input() email = 'rt@gmail.io';
  @Input() phone = '01236547';
  constructor() {}

  ngOnInit() {
  }

}
