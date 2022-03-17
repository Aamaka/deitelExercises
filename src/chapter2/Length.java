package chapter2;

import java.util.Scanner;

public class Length{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("enter speed in meter/second: ");

  double speed = input.nextDouble();

  System.out.print("enter acceleration in meter/seconds: ");
  double accelaration = input.nextDouble();

  
  double length = speed * speed / 2 * accelaration;

  System.out.printf("minimum runway length needed is %.1f",length);


  }


}

