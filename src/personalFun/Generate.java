package personalFun;

import java.security.SecureRandom;

public class Generate {
    public static void main(String[] args) {
        String a = "0123456789";

        char[] arr = new  char[10];
        SecureRandom random = new SecureRandom();


        for (int i = 0; i < 10; i++) {
            arr[i] = a.charAt(random.nextInt(a.length()));
        }
        System.out.println("your account number is: "+ new String(arr));
    }
}
