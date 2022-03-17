package chapter2;

import java.util.Scanner;
public class Cylinder{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the length of a cylinder: ");
	double length = input.nextDouble();
      

	System.out.print("enter the radius of a cylinder: ");
        double radius = input.nextDouble();
    
        double area =(radius*radius*3.14);
        double volume=(area*length);
        System.out.printf("the area is %.0f",area);
        System.out.printf(" the volume is %.0f",volume);



    }



}