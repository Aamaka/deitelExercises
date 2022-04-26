package classActivities;

import java.util.ArrayList;
import java.util.Scanner;

public class LoadingArrays {
     static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
         sumArray();
        sumATwoDArray();
    }

    // single array
    private static void sumArray() {
        int sum = 0;
        //int[] arr = {1,2,3,5};
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            //sum += arr[i];
            System.out.print("enter a number: ");
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("the sum is: " + sum);
        System.out.println("now to the multi dimension");
        System.out.println();
    }

    // multi_dimensional array
     public static void sumATwoDArray(){
        int[][] arr = {{1,2}, {5,5}, {12,34,11}};
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             int sumOfEach = 0;
             for (int j = 0; j < arr[i].length; j++) {
                 sumOfEach += arr[i][j];
                 sum+= arr[i][j];
             }
             System.out.println("sum of scores for a students: "+sumOfEach);
         }
         System.out.println("sum of all students: "+sum);

     }

//     public static double findTheAverageOfTheArray(){
//         int[][] arr = {{1,2}, {5,5}, {12,34,11}};
//         double average = sumATwoDArray();
//        return (double) average/arr.length;
//
//     }
}
