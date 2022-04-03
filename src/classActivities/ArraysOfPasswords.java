package classActivities;

import java.util.Random;

public class ArraysOfPasswords {
    public static void main(String[] args) {


        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "123456890";
        String combinedPassword = upperCase + lowerCase +numbers;
        int length = 12;
        char [] passwords = new char[12];
        Random random = new Random();
        for (int i = 0; i < length;i++){
            passwords[i] = combinedPassword.charAt(random.nextInt(combinedPassword.length()));
        }

        System.out.print(passwords);

        }
    }

