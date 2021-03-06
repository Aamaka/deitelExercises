package personalFun;

public class Craps {

        private boolean isPlaying;
        private String gameStatus;
        private int point;
        private int firstRoll;
        private int newRoll;

        public boolean isPlaying() {
            isPlaying = !isPlaying;
            return isPlaying;
        }

        public void firstRoll(int dice1, int dice2) {
            firstRoll = dice1 + dice2;
            if (firstRoll == 7 || firstRoll == 11) {
                gameStatus = "You Win";
            } else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) {
                gameStatus = "You Lose";
            } else if (firstRoll == 4 || firstRoll == 5 || firstRoll == 6 || firstRoll == 8 || firstRoll == 9 || firstRoll == 10)
                gameStatus = "Continue";
            point = firstRoll;
        }

        public String getNewRollStatus() {
            return gameStatus;
        }

        public void newRoll(int dice1, int dice2) {
            do {
                newRoll = dice1 + dice2;

            } while (newRoll != point && newRoll != 7);

            if(newRoll == 7){
                gameStatus = "You Lose";
            }
            else {
                gameStatus = "You Win";
            }
        }
    }

