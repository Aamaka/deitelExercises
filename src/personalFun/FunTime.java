package personalFun;

import java.util.Scanner;

public class FunTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ten digits: ");
        int digits = scanner.nextInt();

        int firstNumber = digits / 1_000_000_000;
        int secondNumber = (digits / 100_000_000) % 10;
        int thirdNumber = (digits / 10_000_000) % 10;
        int fourthNumber = (digits / 1_000_000) % 10;
        int fifthNumber = (digits / 100_000) % 10;
        int sixthNumber = (digits / 10_000) % 10;
        int seventhNumber = (digits / 1000) % 10;
        int eightNumber = (digits / 100) % 10;
        int ninthNumber = (digits / 10) % 10;
        int tenthNumber = digits % 10;

        int total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber +
                sixthNumber + seventhNumber + eightNumber + ninthNumber + tenthNumber;
        System.out.println("the sum total is "+total);

        int average = total / 10;
        System.out.println("average is "+average);

        int multiple = firstNumber * secondNumber * thirdNumber * fourthNumber * fifthNumber *
                sixthNumber * seventhNumber * eightNumber * ninthNumber * tenthNumber;
        System.out.println("the multiple of the numbers is "+multiple);


        if(firstNumber == tenthNumber && secondNumber == ninthNumber && thirdNumber == eightNumber && fourthNumber == seventhNumber && fifthNumber == sixthNumber ){
            System.out.println(digits + " "+"its a palindrome");
        }
        else System.out.println(digits + " "+"its not a palindrome");
    }
}
