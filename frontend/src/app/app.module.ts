import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BodyComponent } from './body/body.component';
import { ContactusComponent } from './contactus/contactus.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AboutUsComponent } from './about-us/about-us.component';
import { Body2Component } from './body2/body2.component';
import { DispDishesComponent } from './disp-dishes/disp-dishes.component';
import { UpdateDishComponent } from './update-dish/update-dish.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { AddDishComponent } from './add-dish/add-dish.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BodyComponent,
    ContactusComponent,
    AboutUsComponent,
    Body2Component,
    DispDishesComponent,
    UpdateDishComponent,
    LoginComponent,
    AddDishComponent,
    PageNotFoundComponent    
  ],
  imports: [
    RouterModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
