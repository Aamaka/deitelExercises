package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleArray {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        printArray();
        printingArray();
    }

    public int sumMyArray(int... array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public int getSumOfSwappedArray(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 5) {
                array[i] = 0;
            }
            sum += array[i];
        }
        return sum;
    }

    public int getMyBonus(int... bonus) {
        int sum = 0;
        int multiple;
        for (int i = 0; i < bonus.length; i++) {
            multiple = bonus[i] * 2;
            sum += multiple;
        }
        return sum;
    }

    private static void printArray() {
        int[] array = {2, 3, 4, 5, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void printingArray() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number: ");
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}