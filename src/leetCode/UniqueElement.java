package leetCode;

import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {
       int[] arr  ={4, 6, 8, 4, 2, 6};
//        removeDuplicates(arr);
        myArray(arr);
    }

    public static void myArray(int[] arr){
        for (int j : arr) {
            Arrays.sort(arr);
            System.out.println(j);
        }
    }

    public static  void removeDuplicates(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if(arr[i] == arr[j]){
//
//                    System.out.print(arr[i]);
//                    continue;
//
//                }
//                System.out.println();
//            }
//
//            System.out.print(arr[i]);
//        }
        for (int x: arr){

        }
    }
}
