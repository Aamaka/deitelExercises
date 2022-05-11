package personalFun;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWork {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[5];
        getArray(arr);
    }

    private static void getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
            printArray(array);

    }
    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            sortArray(arr);
            System.out.print(arr[i]+ " ");
        }
    }

    private static  void sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);

        }
    }
}
