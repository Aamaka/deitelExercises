package tddClass;

public class Television {
    private boolean isOnOff;
  private int volume;
    private int channels;
  private int brightness;
  private boolean ismute;



    public void turnOnOff() {
        isOnOff = !isOnOff;
    }
    public boolean isOnOff() {
        return isOnOff;
    }





    public void increaseVolume() {
        if (isOnOff) {
            if (ismute)
                ismute = false;
        }
        if (volume >= 0 && volume < 30)
        { volume = volume + 1;}
        }

    public void decreaseVolume() {
        if (isOnOff)
        if (volume > 0 && volume < 50 )



            volume = volume - 1;

    }
    public int getVolume() {
        return volume;
    }

    public void channelIncrease() {
        if (channels >=0 && channels<50 )
        channels = channels + 1;
    }
    public void channelDecrease() {
        if (channels > 0 )
        channels = channels - 1;
    }
    public void setChannels(int number) {
        if(number>= 0 && number< 50){
            channels = number;
        }else {
            System.out.println("You can't increase above 50");
        }
    }

    public void newChannel(int number) {
     setChannels(number);
    }

    public int getChannels() {
        return channels;
    }


    public void increaseBrightness() {
        if (brightness >=0 && brightness < 10)
        brightness = brightness + 1;
    }

    public void decreaseBrightness() {
        if (brightness > 0 && brightness < 11)
        brightness = brightness - 1;

    }
    public int getBrightness() {
        return brightness;
    }

    public void isMute() {
        ismute = !ismute;
    }

    public boolean getIsMute() {

        return ismute;
    }

}
