package leetCode;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {2, 16, 4, 77};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    public static int max(int[] arr){
        int maxi = arr[0];
        for (int m : arr) {
            if (m > maxi) maxi = m;
        }
        return maxi;
    }

    public static  int min(int[] arr){
        int maxi = arr[0];
        for (int m : arr) {
            if (m < maxi) maxi = m;
        }
        return maxi;
    }
}

