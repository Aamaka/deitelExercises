package personalFun;

public enum Months {
    JANUARY("monday", "tuesday"),
    FEBRUARY("Sunday", "Monday","Wednesday"),
    MARCH("Wednesday", "Thursday", "Friday","Saturday"),
    APRIL(),
    MAY("Sunday");

    private  String[] daysOfTheWeek;

    Months(String...daysOfTheWeek){
        this.daysOfTheWeek = daysOfTheWeek;
    }


}
