package PracticeProblem;

import java.util.Scanner;

public class DigitToWord {
 
  int num ;

 public void displayWord(){
    if(this.num==0){
       System.out.println("Zero");
    }else if(this.num==1){
       System.out.println("One");
    }else if(this.num==2){
       System.out.println("Two");
    }else if(this.num==3){
      System.out.println("Three");
    }else if(this.num==4){
      System.out.println("Four");
    }else if(this.num==5){
      System.out.println("Five");
    }else if(this.num==6){
      System.out.println("Six");
    }else if(this.num==7){
      System.out.println("Seven");
    }else if(this.num==8){
      System.out.println("Eight");
    }else if(this.num==9){
      System.out.println("Nine");
    }else {
      System.out.println("Not a single digit number");
    }
  }
  
  public void enterNumber(){
    System.out.println("Enter a single digit number");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
  }
  public static void main(String[] args) {
    DigitToWord obj =new DigitToWord();
    obj.enterNumber();
    obj.displayWord();
}
}
