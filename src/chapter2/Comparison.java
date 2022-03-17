package chapter2;

import java.util.Scanner;
public class Comparison{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("enter digit1:");
       double digit1 = input.nextDouble();
       
       System.out.print("enter digit2:");
       double digit2 =input.nextDouble();
       

       if (digit1 == digit2);
       System.out.printf("%.0f == %.0f%n", digit1, digit2);
       
       if (digit1 != digit2);
       System.out.printf("%.0f != %.0f%n", digit1, digit2);

    
       if (digit1 < digit2);
       System.out.printf("%.0f < %.0f", digit1, digit2);

       if (digit1 > digit2);
       System.out.printf("%.0f > %.0f%n", digit1, digit2);

       if (digit1 <= digit2);
       System.out.printf("%.0f <= %.0f%n", digit1, digit2);

       if (digit1 >= digit2);
       System.out.printf("%.0f >= %.0f%n", digit1, digit2);
 
   }


}

 