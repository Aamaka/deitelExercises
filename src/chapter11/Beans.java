package chapter11;

public class Beans {
    private final int numberOfSpoons;
    private final boolean isOmiEwa;

   public Beans(int amount, boolean isOmiEwa ){
       this.isOmiEwa = isOmiEwa;
       numberOfSpoons = amount / 100;
   }

   public String toString(){
       return String.format("%d spoons of beans %s", numberOfSpoons, isOmiEwa? "with hot omiEwa.":".");
   }

}
