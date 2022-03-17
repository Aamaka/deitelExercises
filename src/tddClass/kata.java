package tddClass;

public class kata {

    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber+secondNumber;
        return result;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result =0;
        if (secondNumber > firstNumber) {result = secondNumber - firstNumber;}
        if (firstNumber > secondNumber) {result = firstNumber - secondNumber;}
        return result;
    }
    public double findAreaWith(int radius){
        return (22 * radius * radius)/7.0;
    }
    public int flip(int bit) {
        int result = 0;
        if(bit == 0) result = 1;
        if (bit == 1)result = 0;
        return result;
    }


    public int numberOfCopies(int copies) {
        if (copies > 1 && copies < 5) {
            copies = copies * 2000;
        } else if (copies > 4 && copies < 10) {
            copies = copies * 1800;
        } else if (copies > 9 && copies < 30) {
            copies = copies * 1600;
        } else if (copies > 29 && copies < 50) {
            copies = copies * 1500;
        } else if (copies > 49 && copies < 100) {
            copies = copies * 1300;
        } else if (copies > 99 && copies < 200) {
            copies = copies * 1200;
        } else if (copies > 199 && copies < 500) {
            copies = copies * 1100;
        } else {
            copies = copies * 1000;
        }return copies;
    }


    public int divisionOfTwoNumbers(int number1, int number2) {

        int result = number1 / number2;

        return result;
    }
}