package javaAssignment;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int correctAnswer = 0;
        int wrongAnswer = 0;

        int number1;
        int number2;



        for (int i = 1; i <= 11;i++) {
            int randomOperators = random.nextInt(5);
            int realAnswer;
            int userAnswer;

            number1 = random.nextInt(100);
            number2 = random.nextInt(100);

            switch (randomOperators) {
                case 1 -> {
                    realAnswer = number1 + number2;
                    System.out.printf("%d + %d = ", number1, number2);
                    userAnswer = input.nextInt();
                    if (userAnswer == realAnswer) {
                        System.out.println("Correct");
                        correctAnswer++;
                    } else {
                        System.out.println("Wrong");
                        wrongAnswer++;
                    }
                }
                case 2 -> {
                    if (number2 > number1) {
                        System.out.printf("%d - %d = ", number2, number1);
                        userAnswer = input.nextInt();
                        realAnswer = number2 - number1;
                    } else {
                        System.out.printf("%d - %d = ", number1, number2);
                        userAnswer = input.nextInt();
                        realAnswer = number1 - number2;
                    }
                    if (realAnswer == userAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                }
                case 3 -> {
                    realAnswer = number1 * number2;
                    System.out.printf("%d * %d = ", number1, number2);
                    userAnswer = input.nextInt();
                    if (realAnswer == userAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                }
                case 4 -> {
                    if (number1 > number2) {
                        realAnswer = number1 / number2;
                        System.out.printf("%d / %d = ", number1, number2);
                    } else {
                        realAnswer = number2 / number1;
                        System.out.printf("%d / %d = ", number2, number1);
                    }
                    userAnswer = input.nextInt();
                    if (realAnswer == userAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                }
            }

        }
            System.out.println( "correct answers = " + correctAnswer++);
            System.out.println("wrongs answers = " +wrongAnswer++);
            System.out.printf("adjusted score = %d ",(correctAnswer - wrongAnswer));

    }
}
