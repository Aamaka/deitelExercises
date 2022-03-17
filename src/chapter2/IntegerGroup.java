package chapter2;

import java.util.Scanner;
public class IntegerGroup{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("enter digit1: ");
       int digit1 = input.nextInt();

       System.out.print("enter digit2: ");
       int digit2 = input.nextInt();

       System.out.print("enter digit3: ");
       int digit3 = input.nextInt();

       System.out.print("enter digit4: ");
       int digit4 = input.nextInt();

       System.out.print("enter digit5:");
       int digit5 = input.nextInt();

       
     int largest = digit1;
     int smallest = digit1;

      if (digit2 > largest){
   
     System.out.print("largest is digit2");

   }

     if (digit3 > largest){
 
     System.out.println("largest is digit3");

   }
 
     if (digit4 > largest){
     
     System.out.print("largest is digit4");

   } 

     if (digit5 > largest){
     
     System.out.print("largest is digit5");

  }

 
     if (digit2 < smallest){
  
     System.out.println("smallest is digit2");
  }

     if (digit3 < smallest){
    
     System.out.println("smallest is digit3");
   }

     if (digit4 < smallest){
     
     System.out.println("smallest is digit4");
   }

     if (digit5 < smallest){
     
     System.out.print("smallest is digit5");
   }


}
}





























              