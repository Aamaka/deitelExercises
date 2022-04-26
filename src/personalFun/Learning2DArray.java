package personalFun;

import java.util.Arrays;
import java.util.Scanner;

public class Learning2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int rows = 0; rows < arr.length; rows++) {
            for (int columns = 0; columns < arr[rows].length; columns++) {
                arr[rows][columns] = in.nextInt();
            }
                //System.out.print(arr[rows][j]+" ");
                System.out.print(Arrays.toString(arr[rows]));

            System.out.println();
        }
    }
}
