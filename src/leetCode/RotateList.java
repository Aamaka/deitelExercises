package leetCode;

import java.util.Arrays;
import java.util.Stack;

public class RotateList {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 67, 8, 9};
        rotate(arr, 2);
    }

    public static void rotate(int[] arr, int numberOfSteps){
        int j;
        Stack<Integer> array = new Stack<>();
        for (int i = 0; i < numberOfSteps; i++) {
            j = array.pop();
            array.insertElementAt(j, arr[0]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
