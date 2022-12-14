import {Component, OnInit , ViewChild} from '@angular/core';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {DialogComponent} from "./dialog_product/dialog.component";
import {ApiService} from "./services/api.service";
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import {MatTableDataSource} from '@angular/material/table';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'CRUD_ANGULAR';
  displayedColumns: string[] = ['productName', 'category', 'date','color','price','comment','action'];
  dataSource!: MatTableDataSource<any>;
  check = false;

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(private dialog: MatDialog, private api:ApiService) {
  }

  ngOnInit() {
    this.getAllProduct();
  }

  openDialog() {
    this.dialog.open(DialogComponent,{
      width: '40%'
    }).afterClosed().subscribe(val =>{
      if(val==='save'){
        this.getAllProduct();
      }
      this.check=false;
    })

    // const dialogRef = this.dialog.open(DialogComponent);
    //
    // dialogRef.afterClosed().subscribe(result => {
    //   console.log(`Dialog result: ${result}`);
    // });
  }

  openProduct(){
    this.getAllProduct();
    this.check=true;
  }
  getAllProduct(){
    this.api.getProduct()
      .subscribe({
        next:(res)=>{
          this.dataSource = new MatTableDataSource(res);
          this.dataSource.paginator = this.paginator;
          this.dataSource.sort= this.sort
        },
        error:()=>{
          alert("Lỗi")
        }
      })
  }
  editProduct(row : any){
    this.dialog.open(DialogComponent,{
      width:'40%',
      data:row
    }).afterClosed().subscribe(val=>{
      if(val==='update'){
        this.getAllProduct();
      }
    })
  }

  deleteProduct(id: number){
    this.api.deleteProduct(id)
      .subscribe({
        next:()=>{
          alert("Xóa thành công")
          this.getAllProduct();
    },
        error:()=>{
          alert("Xóa thất bại")
        }
      })
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
}

