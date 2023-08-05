import { Component,OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  currentroute:any;
  constructor(private route:ActivatedRoute){

  }
  ngOnInit(): void {
    // this.currentroute=this.route.url;

    console.log(this.route.url.subscribe(res=>{
      console.log(res);
    }));
  }
}
