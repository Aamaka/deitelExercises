package abstactsAndInterface;

import java.util.Scanner;

public class Reverse {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        reverse();
    }

    public static void collectInput(){
        System.out.println("Enter the word(s) to be reversed: ");
    }
    public static  void reverse(){
        collectInput();
        String in = scanner.nextLine();
        for (int i = in.length() - 1; i >= 0 ; i--) {
            System.out.print(in.charAt(i));
        }
    }




}
