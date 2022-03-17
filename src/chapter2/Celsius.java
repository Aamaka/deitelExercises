package chapter2;

import java.util.Scanner;
public class Celsius{
      public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      System.out.print("Enter a degree in celsius:");
      double celsius= input.nextDouble( );
      
      double fahrenheit=(9.0/5)* celsius+32;
      System.out.printf("%.0f celsius is %.0f fahrenheit",celsius,fahrenheit);
      
      }

}