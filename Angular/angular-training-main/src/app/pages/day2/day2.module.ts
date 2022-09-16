import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { Day2RoutingModule } from './day2-routing.module';
import { Day2Component } from './day2.component';


@NgModule({
  declarations: [
    Day2Component
  ],
  imports: [
    CommonModule,
    Day2RoutingModule
  ]
})
export class Day2Module { }
