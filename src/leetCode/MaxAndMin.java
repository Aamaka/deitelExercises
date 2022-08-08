package leetCode;

import java.util.Arrays;

import static java.util.stream.IntStream.of;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {2, 16, 4, 77};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    public static int maximum(int[] arr){
        int maxi = arr[0];
        for (int m : arr) {
            if (m > maxi) maxi = m;
        }
        return maxi;
    }
    public static int max(int[] list) {
        return of(list).max().getAsInt();
}

    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static  int minimum(int[] arr){
        int maxi = arr[0];
        for (int m : arr) {
            if (m < maxi) maxi = m;
        }
        return maxi;
    }
}

