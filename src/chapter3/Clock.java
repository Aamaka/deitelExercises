package chapter3;

public class Clock {

    private int hour;
    private int minutes;
    private int seconds;

    public void setHour(int hour) {
        if(hour <= 23)
      this.hour = hour;
        else {
            this.hour = 0;
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
