package chapter2;

import java.util.Scanner;

public class Convertion{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("enter a number in pounds: ");

  double pounds = input.nextDouble();

  double kilograms =  pounds * 0.454;

  System.out.printf("%.3f kilograms",kilograms);


  }


}