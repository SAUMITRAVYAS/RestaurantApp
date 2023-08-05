import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { DispDishService } from '../disp-dishes/disp-dish.service';

@Component({
  selector: 'app-add-dish',
  templateUrl: './add-dish.component.html',
  styleUrls: ['./add-dish.component.css'],
  providers: [DispDishService]
})
export class AddDishComponent {

  // Define a form group with form controls for dish name, description, price, image, and nature
  dishForm = new FormGroup({
    dishName: new FormControl('', [Validators.required]),
    dishDescription: new FormControl('', [Validators.required]),
    dishPrice: new FormControl(0, [Validators.required]),
    dishImage: new FormControl('', [Validators.required]),
    nature: new FormControl('', [Validators.required]),
    // dishCategory: ['', Validators.required]
  });

  constructor(private service: DispDishService) {
  }

  // This method is called when the form is submitted
  onSubmit() {

    // Extract the category ID from the URL
    const urlPath = new URL(window.location.href).pathname;
    const categoryId = parseInt(urlPath.split("/")[2])

    // Validate the form
    if (this.dishForm.valid) {

      // Call the addDish() method of the DispDishService to add the new dish to the menu
      this.service.addDish(categoryId,this.dishForm.value).subscribe(res =>{
        console.log(res);
      })
    }

    // Log the form values and validity
    console.log(this.dishForm.value, this.dishForm.valid);
  }
}