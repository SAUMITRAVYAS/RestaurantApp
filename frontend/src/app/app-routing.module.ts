import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactusComponent } from './contactus/contactus.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BodyComponent } from './body/body.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { Body2Component } from './body2/body2.component';
import { DispDishesComponent } from './disp-dishes/disp-dishes.component';
import { LoginComponent } from './login/login.component';
import { AddDishComponent } from './add-dish/add-dish.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

// import {bo}
const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  // {path:'adddish',component: AddDishComponent},
  { path: 'login', component: LoginComponent },
  // { path: 'home', pathMatch: 'full' },
  { path: 'home', component: BodyComponent },
  { path: 'contactus', component: ContactusComponent },
  { path: 'aboutus', component: AboutUsComponent },
  {
    path: 'body2',
    children: [
      { path: '', pathMatch: 'full', component: Body2Component },
      {
        path: ':name',
        children: [
          { path: '', component: DispDishesComponent },
          { path: 'add', component: AddDishComponent },
        ],
      },
    ],
  },
  { path: '**', component: PageNotFoundComponent }
  // {path : 'dispdishes', component : DispDishesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
