import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatDialogModule} from '@angular/material/dialog';
import {DialogComponent } from './dialog_product/dialog.component';
import {MatInputModule} from '@angular/material/input';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from "@angular/material/select";
import {MatRadioModule} from '@angular/material/radio';
import {ReactiveFormsModule} from "@angular/forms";
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {MatTableModule} from '@angular/material/table';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatSortModule} from '@angular/material/sort';
import {MatMenuModule} from '@angular/material/menu';
@NgModule({
  declarations: [
    AppComponent,
    DialogComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    MatIconModule,
    MatToolbarModule,
    MatButtonModule,
    MatDialogModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatFormFieldModule,
    MatSelectModule,
    MatRadioModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    MatMenuModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
