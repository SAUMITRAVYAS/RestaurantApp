import { Component, OnInit } from '@angular/core';
import { Router, NavigationStart, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit  {
  title = 'MyRetaurant';
  showNavbar: boolean = true;
  
  constructor(private router: Router) {
    
  }
  ngOnInit(): void {
    this.router.events.subscribe(event => {
        if (window.location.href.includes("/login")) {
          this.showNavbar = false;
        } 
        // else if(window.location.href.includes("/**")) {
        //   this.showNavbar = false;
        // }
        else {
          this.showNavbar = true;
        }
    });
  }

}
