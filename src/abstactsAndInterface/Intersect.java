package abstactsAndInterface;
import java.util.Arrays;

public class Intersect {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 2, 6};
        int[] arr1 = {7, 8, 5, 6};

        for (int j : arr) {
            for (int k : arr1) {
                if (j == k) {
                    int[] a = {j};
                    System.out.print(Arrays.toString(a));
                }
            }
        }
    }
}
