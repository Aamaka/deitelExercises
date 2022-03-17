package chapter2;

import java.util.Scanner;
public class NumberOfYears{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("enter the minutes: ");
   int minutes = input.nextInt();

  int day = minutes/1_440;
  int minutesInAYear = 525_600;

  if(day / 365 >= 1){
    
    int days = day % 365;
    int year = minutes/minutesInAYear;
    

    System.out.printf("%d days and %d years", days,year);
}
  

  












}











}