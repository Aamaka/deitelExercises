package personalFun;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        hmm();

    }
        private static void hmm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 5: ");
        int userInput = scanner.nextInt();
            switch (userInput) {
                case 1 -> System.out.println("you entered one");
                case 2 -> System.out.println("you entered two");
                case 3 -> System.out.println("you entered three");
                case 4 -> System.out.println("you entered four");
                case 5 -> System.out.println("you entered five");
                default -> hmm();
            }

        }
    }

