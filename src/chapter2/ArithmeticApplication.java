package chapter2;

import java.util.Scanner;
public class ArithmeticApplication{
       public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       System.out.print("enter first number:");
       int firstnumber =input.nextInt();

       System.out.print("enter second number:");
       int secondnumber = input.nextInt();
       
      int  square1 = firstnumber * firstnumber;
      int  square2 = secondnumber * secondnumber;

      int difference = square1 - square2;
       
      
      System.out.printf("difference is %d",difference);

  }



}
 
      