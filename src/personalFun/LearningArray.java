package personalFun;

import java.util.Arrays;
import java.util.Scanner;

public class LearningArray {
   static Scanner in = new Scanner(System.in);
    private static final int [][] arr = {{1,2,3}, {4,5,6}};
    public static void main(String[] args) {
      //  Arrays.equals(sum(),sumArray());
        sumArray();
        loadArray();
        stringArrays();
        int addition = sum();
        System.out.println(addition);
        double divide = average();
        System.out.println(divide);

        sumOfEverySubjectAStudentOfOffers(1);
    }

    public static  void sumArray(){
        int [] array = {4,6,7,9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

public static  void loadArray() {
    //create array
    int[] rnos = new int[10];
    for (int i = 0; i < rnos.length; i++) {
        // enter input for manual initialization
        System.out.print("enter a number: ");
        rnos[i] = in.nextInt();
    }
    for (int i = 0; i < rnos.length; i++) {
        System.out.print(rnos[i] + " ");
    }
    System.out.println();
    // ascending order from one index to another

    Arrays.sort(rnos, 4, 8);
    System.out.println(Arrays.toString(rnos));

    //ascending order from top to bottom
    Arrays.sort(rnos);
    System.out.println(Arrays.toString(rnos));
}
   public static void stringArrays() {
       String[] str = new String[5];

       for (int j = 0; j < str.length; j++) {
           System.out.print("enter a string: ");
           str[j] = in.next();
       }
       System.out.println(Arrays.toString(str));
       Arrays.sort(str);
       System.out.println(Arrays.toString(str));
   }
    public static void sumOfEverySubjectAStudentOfOffers(int studentIndex){
        int sum = 0;
        //for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arr[studentIndex].length; j++) {
                sum += arr[studentIndex][j];

            }

        //}
        System.out.println(sum);

    }
    public static int sum(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
        }
        return sum;
    }
    public static double average(){
        double addition = sum();
        return addition/arr.length;
    }
}
