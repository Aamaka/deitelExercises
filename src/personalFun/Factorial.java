package personalFun;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {


            int product = (number - 1) * i;
            System.out.println(product);
        }
    }
}