package classActivities;

import java.math.BigInteger;

public class MyBigInteger {
    public static void main(String[] args) {

        System.out.println(m(BigInteger.valueOf(5)));
    }


    public static BigInteger m(BigInteger n){
        if(n.equals(BigInteger.ONE)){
            return n;
        }
        if(n.equals(BigInteger.valueOf(2))){
            return n;
        }
        return n.multiply(m(n.subtract(BigInteger.ONE)));
    }
}
