package chapter8;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds) {
        validate(hour, minutes, seconds);
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time() {
        this(0, 0, 0);
    }

    public Time(int seconds) {
        this(0, 0, seconds);

    }

    public Time(int minutes, int seconds) {
        this(0, minutes, seconds);
    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid Hour");

    }

    private static void validateMinutes(int minutes) {
        boolean minutesIsInvalid = minutes < 0 || minutes >= 60;
        if (minutesIsInvalid) throw new IllegalArgumentException("Invalid minutes");
    }

    private static void validateSeconds(int seconds) {
        boolean secondsIsInvalid = seconds < 0 || seconds >= 60;
        if (secondsIsInvalid) throw new IllegalArgumentException("Invalid seconds");

    }

    private static void validate(int hour, int minutes, int seconds) {
        validateHour(hour);
        validateMinutes(minutes);
        validateSeconds(seconds);
    }

    public void setTime(int hour, int minutes, int seconds) {
        validate(hour, minutes, seconds);

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        validateMinutes(minutes);
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    public String getTime() {
        return hour + ":" + minutes + ":" + seconds;
    }
}
