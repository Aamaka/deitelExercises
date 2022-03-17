package chapter2;

import java.util.Scanner;

public class Savings{
  public static void main(String[] args){   
  Scanner input = new Scanner(System.in);
 
  System.out.print("enter monthly savings amount: ");
  int amount = input.nextInt();
  
  int amountAfterSixthMonth = amount * 6;

  System.out.printf("%d", amountAfterSixthMonth);


}


}