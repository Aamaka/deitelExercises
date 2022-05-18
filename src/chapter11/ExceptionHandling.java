package chapter11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
      solve();

    }
    private static int quotient(int numerator, int denominator){

        return numerator / denominator;
    }

    private static void solve(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("enter numerator: ");
            int numerator = input.nextInt();
            System.out.println("enter denominator: ");
            int denominator = input.nextInt();
            int result = quotient(numerator,denominator);
            System.out.println(result);
        }
        catch (InputMismatchException | ArithmeticException arithmeticException){
            System.err.printf("%nException: %s%n", arithmeticException);
            display();
            solve();
        }
    }
    private static  void display(){
        System.out.println("i expect only integers greater than Zero");
        System.out.println();
    }

}