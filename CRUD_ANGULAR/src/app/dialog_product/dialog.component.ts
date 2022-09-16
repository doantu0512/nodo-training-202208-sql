import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup,FormBuilder,Validators} from "@angular/forms";
import {ApiService} from "../services/api.service";
import{MatDialogRef, MAT_DIALOG_DATA} from "@angular/material/dialog";

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.scss']
})
export class DialogComponent implements OnInit {
  ColorList=["Xanh","Đỏ","Tím","Vàng"]
  productForm !: FormGroup;
  actionBtn : string ="Save"
  constructor( private formBuilder : FormBuilder,
               private api : ApiService,
               @Inject(MAT_DIALOG_DATA) public editData : any,
               private dialogRef :MatDialogRef<DialogComponent>) { }

  ngOnInit(): void {
    this.productForm = this.formBuilder.group({
      productName :['',Validators.required],
      category :['',Validators.required],
      date :['',Validators.required],
      color :['',Validators.required],
      price :['',Validators.required],
      comment :['',Validators.required],
    });
    if (this.editData){
      this.productForm.controls['productName'].setValue(this.editData.productName);
      this.productForm.controls['category'].setValue(this.editData.category);
      this.productForm.controls['date'].setValue(this.editData.date);
      this.productForm.controls['color'].setValue(this.editData.color);
      this.productForm.controls['price'].setValue(this.editData.price);
      this.productForm.controls['comment'].setValue(this.editData.comment);
      this.actionBtn="Update";
    }

  }
  addProduct(){
    if(!this.editData){
      if(this.productForm.valid){
        this.api.postProduct(this.productForm.value)
          .subscribe({
            next:(res)=>{
              alert("Sản Phẩm Thêm thành công")
              this.productForm.reset();
              this.dialogRef.close('save');
            },
            error:()=>{
              alert("Thêm thất bại")
            }
          })
      }
    }else {
      this.updateProduct()
    }
  }
  updateProduct(){
    this.api.putProduct(this.productForm.value,this.editData.id)
      .subscribe({
        next:()=>{
          alert("Cập nhật sản phẩm thành công")
          this.productForm.reset();
          this.dialogRef.close('update');
        },
        error:()=>{
          alert("Cập nhật thất bại");
        }
      })
  }

}
