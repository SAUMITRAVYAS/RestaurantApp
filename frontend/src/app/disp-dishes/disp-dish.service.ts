import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class DispDishService {
  constructor(private _http: HttpClient) {}

  // This method sends a DELETE request to the API to delete a dish with the given ID
  deletedish(id: number) {
    return this._http.delete('http://localhost:9091/api/dish/' + id);
  }

  // This method sends a GET request to the API to fetch dishes for the given category ID
  getdish(categoryId: number) {
    return this._http.get('http://localhost:9091/api/dish/' + categoryId);
  }

  // This method sends a POST request to the API to add a new dish to the given category
  addDish(categoryId: number, dish: any) {
    return this._http.post(
      'http://localhost:9091/api/' + categoryId + '/dish',
      dish
    );
  }
}