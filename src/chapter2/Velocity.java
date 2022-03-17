package chapter2;

import java.util.Scanner;

public class Velocity{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("enter v0 (initial velocity) in meter/second: ");

  double v0 = input.nextDouble();

  System.out.print("enter v1 (final velocity) in meter/seconds: ");
  double v1 = input.nextDouble();

  System.out.print("enter t (time) in seconds: ");
  double t = input.nextDouble();


  double averageacceleration = (v1 - v0) / t;


  System.out.printf("average acceleration is %f", averageacceleration);


  }


}

