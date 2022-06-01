package javaAssignmentTest;

public class DuplicateArrays {
    public static void main(String[] args) {
        int[][] array = {{4, 5, 6, 7},{9, 7, 6, 8,3}};
        sumOfEachArray(array);

        int[] arr = {12, 13, 6, 10};
        int[] att = {13, 10, 16, 15};
        sumDuplicates(arr,att);
        distinctNumber(arr, att);

    }

    public static void sumOfEachArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println(sum);
        }
    }

    public  static  void sumDuplicates(int[]array , int[] arrays){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if(array[i] == arrays[j]){
                    int tot = array[i] + array[i];
                    sum+=tot;
                }
            }
        }
        System.out.println(sum);
    }
    public static  void distinctNumber(int[] arr, int[] arrays){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if(arr[i] != arrays[j]) {
                    int total = arr[i] + arrays[j];
                    sum += total;
                }
            }
        }
        System.out.println(sum);
    }
}
