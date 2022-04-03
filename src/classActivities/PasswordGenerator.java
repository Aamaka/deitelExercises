package classActivities;

import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        char[] password = {'A','B','C','D','E','F','G','H','I','J',
                'K','L','M','N','O','P','Q','R','S','T','U','V','W',
                'X','Y','Z', 'a','b','c','d','e', 'f','g','h','i',
                'j','k','l', 'm','n','o','p','q','r','s','t','u','v',
                'w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
        SecureRandom random = new SecureRandom();
        char pass;
        for (int i = 0; i < 12; i++){

            pass = password[random.nextInt(61)];
            System.out.print(pass);
        }
    }
}
