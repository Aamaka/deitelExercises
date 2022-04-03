package javaAssignment;

import java.security.SecureRandom;

public class ArraysCalculation {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        SecureRandom random = new SecureRandom();
        int maximum = 0;
        int sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1,50);
            if(numbers[i] > maximum)maximum = numbers[i];
              sum+=numbers[i];
              average =(double) sum / numbers.length;
            System.out.print(numbers[i]+" ");
            }
        System.out.println();
        System.out.printf(" the maximum is: %d%n the sum is:  %d%n the average is: %.1f ",maximum,sum,average );
        }




    }


