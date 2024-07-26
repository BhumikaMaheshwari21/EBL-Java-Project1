import { Component } from '@angular/core';
// import { FormGroup, FormBuilder, Validators } from '@angular/forms';
// import { of } from 'rxjs';
import { CustomerTS } from '../../types/tstypes/Customerts';

@Component({
  selector: 'app-customerarray',
  // standalone: true,
  // imports: [],
  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})

export class CustomerarrayComponent {
  customers:CustomerTS[]=[
    new CustomerTS("abc","abc@gmail.com","12345","123","engineer","A102"),
    new CustomerTS("cab","cab@gmail.com","1234549","12349","software engineer","A103")
  ]
}