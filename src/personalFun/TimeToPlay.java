package personalFun;

import chapter5.chapter6.Division;

public class TimeToPlay {
    public static void main(String[] args) {
        Division mydiv = new Division();
        mydiv.setDivisibleNumbers(1,2,3,4,5,6,7,8,9,0);
        System.out.println(mydiv.isDivisible());
    }


}
