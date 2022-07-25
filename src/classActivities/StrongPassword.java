package classActivities;

import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {
        String s = "6yA";
        int n = 3;

        int result = returnMininumCharacterToMakeStrongPassword(s,  n);
        System.out.println(result);
    }

    private static int returnMininumCharacterToMakeStrongPassword(String s, int n) {
        Pattern digit = Pattern.compile("\\d");
        Pattern upper = Pattern.compile("[A-Z]");
        Pattern lower = Pattern.compile("[a-z]");
        Pattern special = Pattern.compile("\\W");
//
//        Matcher digit1 = Pattern.matches();
        int result = 0;

        //for upperCase
        if(!s.matches("[A-Z]")){
            result++;
        }

        //for lowerCase
        if(!s.matches("[a-z]")){
            result++;
        }

        //for digits
        if(!s.matches("[\\d]")){
            result++;
        }

        //for special character
        if(!s.matches("[^a-zA-Z\\d]")){
            result++;

        }
        if(n + result < 6){
            result += 6 -(n + result);
        }

        return result;
   }
}
