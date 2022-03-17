package chapter2;

import java.util.Scanner;
public class Calculation{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("enter number1: ");
       int number1 = input.nextInt();

       System.out.print("enter number2: ");
       int number2 = input.nextInt();

       System.out.print("enter number3: ");
       int number3 = input.nextInt();
   

      int sum = number1 + number2 + number3;
      

      int average = (number1 + number2 + number3) / 3;
      

      int product = number1 * number2 * number3;
       
     System.out.printf("sum of %d, %d and %d is %d%n", number1,number2,number3,sum);
     System.out.printf("average of %d, %d and %d is %d%n", number1, number2, number3,average);
     System.out.printf("product of %d, %d and %d is %d%n", number1, number2, number3,product);



      int largest = number1;
      int smallest = number1;


     if (number2 > largest){

     System.out.println("largest is number2");
}
     if (number3 > largest){
     
     System.out.println("largest is number3");
   }

     if (number2 < smallest){
     
     System.out.println("smallest is number2");
}

     if (number3 < smallest){
    
     System.out.println("smallest is number3");

    
   }
 }  
 }
  