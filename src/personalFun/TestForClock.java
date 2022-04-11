package personalFun;

import chapter3.Clock;

public class TestForClock {
    public static void main(String[] args) {
        Clock clock = new Clock(22,12,6);
        System.out.println(clock.getDisplayTime());
        Clock.setHour(12);
        System.out.println(clock.getHour());
        clock.setSeconds(123);
        System.out.println(clock.getSeconds());
        System.out.println(clock.getMinutes());
    }
}