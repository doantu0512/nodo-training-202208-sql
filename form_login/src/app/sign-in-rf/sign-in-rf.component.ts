import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-sign-in-rf',
  templateUrl: './sign-in-rf.component.html',
  styleUrls: ['./sign-in-rf.component.scss']
})
export class SignInRfComponent implements OnInit {
  // signInForm = new FormGroup({
  //   username: new FormControl(''), // <== default value
  //   password: new FormControl(''), // <== default value
  //   rememberMe: new FormControl(false), // <== default value
  // });
  signInForm = this.fb.group({
    username:"",
    password:"",
    rememberMe: false,
  })
  constructor( private fb: FormBuilder) { }

  ngOnInit(): void {
  }

}
