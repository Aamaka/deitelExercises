package classActivities;


public class StrongPassword {
    public static void main(String[] args) {
        String s = "a";
        int n = 1;

        int result = returnMininumCharacterToMakeStrongPassword(s,  n);
        System.out.println(result);
    }

    private static int returnMininumCharacterToMakeStrongPassword(String s, int n) {
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
