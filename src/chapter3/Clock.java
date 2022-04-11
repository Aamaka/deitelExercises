package chapter3;

public class Clock {

    private static int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour, int minutes, int seconds) {
        Clock.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public  static void setHour(int hour) {
        if(hour <= 23)
      Clock.hour = hour;
        else {
            Clock.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {
        if(minutes <= 59)
        this.minutes = minutes;

        else {
            this.minutes= 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds <= 59)
        this.seconds = seconds;
        else{
            this.seconds = 0;
        }
    }

    public int getSeconds() {
        return seconds;

    }

    public String getDisplayTime() {
        return  hour+":"+ minutes+ ":"+seconds;
    }
}
