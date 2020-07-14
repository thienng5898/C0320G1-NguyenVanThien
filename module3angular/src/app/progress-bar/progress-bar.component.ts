import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-progress-bar',
  templateUrl: './progress-bar.component.html',
  styleUrls: ['./progress-bar.component.css']
})
export class ProgressBarComponent implements OnInit {
  @Input() backgroundColor = '#fff6f2';
  @Input() progressColor = '#1d1eaf';
  @Input() width = 50;
  constructor() {}

  ngOnInit() {
  }

}
