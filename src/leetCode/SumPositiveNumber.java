package leetCode;

public class SumPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,-4,7,12};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
            }
        }
        return sum;
    }

}
