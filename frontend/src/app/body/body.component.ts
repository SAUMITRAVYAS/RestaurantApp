import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BodyService } from './body.service';
import { Body2Component } from '../body2/body2.component';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css'],
})
export class BodyComponent implements OnInit {

   // menus: any = [
  //   {
  //     name: 'Lunch',
  //     url: '/assets/res.jpg',
  //   },
  //   {
  //     name: 'Breakfast',
  //     url: '/assets/breakfast.png',
  //   },
  //   {
  //     name: 'Dinner',
  //     url: '/assets/dinner.webp',
  //   },
  //   {
  //     name: 'Snacks',
  //     url: '/assets/snacks.webp',
  //   },
  // ];

  // Define an array to hold the menu data
  newdata: any = [];

  constructor(private _bodyservice: BodyService, private router: Router) {}

  ngOnInit() {
    // Call the getdata() method of the BodyService to fetch the menu data
    this._bodyservice.getdata().subscribe(res => {
      this.newdata = res;
    });
  }

  // Navigate to the Body2Component
  gotobody2() {
    this.router.navigate(['/body2']);
  }
}