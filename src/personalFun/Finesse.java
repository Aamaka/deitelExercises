package personalFun;

import java.util.Arrays;

public class Finesse {
    public static void main(String[] args) {
        int[] numbers = {36, 534, 534, 545, 64, 4534};
        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];
        for(int i : numbers){
            max = Math.max(max, i);
        }
        System.out.println(max);

        int min = numbers[0];
        for(int i : numbers){
            min = Math.min(min,i);
        }
        System.out.println(min);
    }
}
