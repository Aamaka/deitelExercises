package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class RollDice {
    public static void main(String... args) {

        SecureRandom random = new SecureRandom();
        int[] arr = new int[11];
        for (int i = 0; i < 300_000; i++) {

            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);

            int sum = die1 + die2;

            switch (sum) {
                case 2 -> arr[0]++;
                case 3 -> arr[1]++;
                case 4 -> arr[2]++;
                case 5 -> arr[3]++;
                case 6 -> arr[4]++;
                case 7 -> arr[5]++;
                case 8 -> arr[6]++;
                case 9 -> arr[7]++;
                case 10 -> arr[8]++;
                case 11 -> arr[9]++;
                case 12 -> arr[10]++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}