import { Component } from '@angular/core';

@Component({
  selector: 'app-body2',
  templateUrl: './body2.component.html',
  styleUrls: ['./body2.component.css']
})
export class Body2Component {

     category: any = [
     {
      id:1,
       name: 'Appetizers',
       url: 'https://images.unsplash.com/photo-1577906096429-f73c2c312435?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80.jpg',
     },
     {
      id:2,
       name: 'Main Course',
       url: 'https://images.unsplash.com/photo-1529566652340-2c41a1eb6d93?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80.jpg',
     },
     {
      id:3,
       name: 'Desserts',
       url: 'https://images.unsplash.com/photo-1587314168485-3236d6710814?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=778&q=80.jpg',
     },
     {
      id:4,
       name: 'Beverages',
       url: 'https://images.unsplash.com/photo-1496318447583-f524534e9ce1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1234&q=80.jpg',
     },
   ];
}
