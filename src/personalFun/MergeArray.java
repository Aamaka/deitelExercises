package personalFun;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array = {1,3,4,6};
        int[] arr = {2,5,7};

        int b = array.length;
        int c = arr.length;

        int newLength = b + c;

        int[] newArray = new int[newLength];

        System.arraycopy(array, 0,newArray,0,b);
        System.arraycopy(arr, 0,newArray,b,c);

        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
    }
}

