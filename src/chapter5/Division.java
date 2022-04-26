package chapter5;

public class Division {
  private int sum;
    public void numbers(int limitOfNumber) {
        for (int i = 0; i < limitOfNumber; i++) {
            if(i % 3 == 0){
                sum += i;
            }
        }
    }

    public int getAnswer() {
        return sum;
    }

}
