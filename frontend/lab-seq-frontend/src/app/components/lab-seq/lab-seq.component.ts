import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-lab-seq',
  templateUrl: './lab-seq.component.html',
  styleUrls: ['./lab-seq.component.css']
})
export class LabSeqComponent {
  number: number | null = null;
  result: number | null = null;
  errorMessage: string = "";
  
  constructor(private http: HttpClient){}

  calculate(){
    if(this.isValidInput()){
      this.http.get<number>(`http://localhost:8080/lab-seq?n=${this.number}`)
      .subscribe({
        next: data => {
          this.result = data;
          this.errorMessage = "";
        },
        error: error => {
          console.error(error);
          this.errorMessage = 'Error occurred while calculating LabSeq value.';
        }
      });
    } else {
      this.errorMessage = 'Invalid input. Please enter a valid number.';
      this.result = null;
    }
  }

  private isValidInput(): boolean {
    return this.number !== null && this.number !== undefined && !isNaN(this.number);
  }
}
