import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  constructor(private router: Router) {}

  onSubmit() {
    // Static validation for username and password
    if (this.username === 'admin' && this.password === 'password') {
      // If login is successful, navigate to the home component
      this.router.navigate(['/home']);
    } else {
      // If login is unsuccessful, show an alert
      alert('Invalid credentials');
    }
  }
}
