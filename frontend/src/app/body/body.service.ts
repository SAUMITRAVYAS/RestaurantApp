import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BodyService {

  constructor(private _http: HttpClient) { }

  // This method fetches the menu data from the API
  getdata() {
    return this._http.get('http://localhost:9091/api/menu');
  }
}