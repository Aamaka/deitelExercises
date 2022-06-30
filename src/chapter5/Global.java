package chapter5;

import java.util.Scanner;

public class Global {
    private static int failed;
    private static int passed;
    static Scanner input = new Scanner(System.in);
    private static String userInput;


    public static void questions() {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        counter();


    }

    private static void questionFive() {
        System.out.println("""
                                
                Question 5:
                                
                What is the first capital of Nigeria?
                a. Abuja
                b. Calabar
                c. Lagos
                d. Kaduna
                """);
        questionFiveSwitch();
    }

    public static void questionFiveSwitch() {
        userInput = input.next().toLowerCase();
        switch (userInput) {
            case "a", "c", "d" -> failedCounter();

            case "b" -> passedCounter();

            default -> questionFive();
        }
    }

    public static void questionFour() {
        System.out.println("""
                Question 4:
                                
                Which is the odd one?
                a. Lome
                b. Abuja
                c. Dakar
                d. Kano
                """);
        questionFourSwitch();
    }

    private static void questionFourSwitch() {
        userInput = input.nextLine().toLowerCase();
        switch (userInput) {
            case "a", "b", "c" -> failedCounter();

            case "d" -> passedCounter();

            default -> questionFour();
        }
    }

    public static void questionThree() {
        System.out.println("""
                Question 3:
                                
                How many sides are there in a pentagon?
                a. 9
                b. 5
                c. 6
                d. 7
                """);
        questionThreeSwitch();
    }

    private static void questionThreeSwitch() {
        userInput = input.nextLine().toLowerCase();
        switch (userInput) {
            case "a", "c", "d" -> failedCounter();

            case "b" -> passedCounter();

            default -> questionThree();
        }
    }

    public static void questionTwo() {
        System.out.println("""
                Question 2:
                                
                How many local government in Nigeria?
                a. 774
                b. 747
                c. 477
                d. 746
                """);
        questionTwoSwitch();
    }


    public static void questionOne() {
        System.out.println("""
                Question 1:
                                    
                How many states are there in Nigeria?
                a. 32
                b. 34
                c. 35
                d. 36
                """);
        questionOneSwitch();
    }


    private static void questionOneSwitch() {
        userInput = input.nextLine().toLowerCase();
        switch (userInput) {
            case "a", "b", "c" -> failedCounter();

            case "d" -> passedCounter();

            default -> questionOne();
        }
    }

    private static void questionTwoSwitch() {
        userInput = input.nextLine().toLowerCase();
        switch (userInput) {
            case "a" -> passedCounter();

            case "b", "c", "d" -> failedCounter();

            default -> questionTwo();
        }
    }

    private static void passedCounter() {
        passed++;
    }

    private static void failedCounter() {
        failed++;
    }

    private static void counter() {
        System.out.println("Number of questions passed = " + passed);
        System.out.println("Number of questions failed = " + failed);
        System.out.println();
        check();
    }

    private static void check() {
        if (passed == 5) System.out.println("Excellent");
        else if (passed == 4 && failed == 1) System.out.println("Very good");
        else System.out.println("Work harder");
    }

}
