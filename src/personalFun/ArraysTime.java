package personalFun;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTime {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {12, 45, 77, 98, 2, 5,88,9,45,76};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        loadAnArray();
        sumLoadedArray();
       printSortedArray(array);
        Arrays.sort(array,1,6);
        System.out.println(Arrays.toString(array));
    }

    public static void loadAnArray() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("enter number: ");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
    public static void sumLoadedArray(){
        int sum = 0;
        //loadAnArray();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            sum += i;

        }
        System.out.println(sum);
    }

    public  static void sortArray(int[] number){
        Arrays.sort(number);
    }
    public static  void printSortedArray(int[] number){
        sortArray(number);
        System.out.println();
    }


}
