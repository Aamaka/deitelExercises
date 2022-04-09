package eBanking;

public class Craps {

    private boolean isPlaying;
    private String mode;
    private int roll;
    private int addition;
    private  int sum;

    public void isPlaying() {
        isPlaying = !isPlaying;
    }

    public boolean getIsPlaying() {
        return isPlaying;
    }

//    public void firstRoll() {
//        Random random = new Random();
//        int dice1 = random.nextInt(6);
//        int dice2 =  random.nextInt(6);
//       int firstRoll = dice1 + dice2;
//       if(firstRoll == 7 ){
//           System.out.println("you win");
//       }
//       else  if (firstRoll == 11)
//    }



    public void rollDice(int dice1, int dice2) {

        sum = dice1 + dice2;
        if (sum == 7 || sum == 11) {
            mode = "you win";
        } else if (sum == 2 || sum == 3 || sum == 12) {
            mode = "you lose";
        }
        otherRoll(dice1,dice2);
    }
        public void otherRoll(int dice1 , int dice2) {
            addition = sum;

             if (addition == 4 || addition == 5 || addition == 6 || addition == 8 || addition == 9 || addition == 10) {
               // newRoll(dice1, dice2);
                 mode = "roll again";
            }
        }


    public String getRoll() {
        return mode;
    }

    public  void newRoll(int dice1, int dice2){

        while(roll != -1){
            if(dice1 + dice2 == addition){
                mode = "you win";
                break;
            }
            else  if (dice1 + dice2 == 7 && dice1 + dice2 == 11){
                mode = "you lose";
                break;
            }
            else  mode = "try again";
            roll++;
        }
    }


}
