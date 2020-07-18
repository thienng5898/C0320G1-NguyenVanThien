import {Component, OnInit, TemplateRef, ViewChild} from '@angular/core';

@Component({
  selector: 'app-img-slide',
  templateUrl: './img-slide.component.html',
  styleUrls: ['./img-slide.component.css']
})
export class ImgSlideComponent implements OnInit {
  @ViewChild('tmpl', {static: true}) template: TemplateRef<any>;
  constructor() { }

  ngOnInit() {
  }

}
