package tddClass;

public class AutoBike {
    private boolean engine;
    private int speed;
    private int gear;

    public void onOff() {
        if (!engine) {
            engine = true;
        } else {
            engine = false;
        }

    }

    public boolean isOn() {
        return engine;
    }


    public void accelerate() {
        if (  speed < 21) {
            speed = speed + 1;
        } else
            if (speed > 19 && speed < 30) {
                speed = speed + 2;
            } else
                if (speed > 30 && speed < 40) {
                    speed = speed + 3;
                } else
                    if (speed > 40) {
                        speed = speed + 4;
                    }
                }



    public void deccelerate() {
        if (speed >= 1 && speed < 20) {
            speed = speed - 1;
        } else if (speed > 19 && speed < 30) {
            speed = speed - 2;
        } else if (speed > 29 && speed < 40) {
            speed = speed - 3;
        } else if (speed > 40) {
            speed = speed - 4;
        }

    }


    public int getSpeed() {
        return speed;
    }
}
