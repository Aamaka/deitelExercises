package tddClass;

public class kata {

    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (secondNumber > firstNumber) {
            result = secondNumber - firstNumber;
        }
        if (firstNumber > secondNumber) {
            result = firstNumber - secondNumber;
        }
        return result;
    }

    public double findAreaWith(int radius) {
        return (22 * radius * radius) / 7.0;
    }

    public int flip(int bit) {
        int result = 0;
        if (bit == 0) result = 1;
        if (bit == 1) result = 0;
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
        }
        return copies;
    }


    public int divisionOfTwoNumbers(int number1, int number2) {

        return number1 / number2;

    }

    public boolean isEven(int digit) {

        boolean result;

        result = digit % 2 == 0;
        return result;
    }

    public int biggest(int number, int number1, int number2, int number3, int number4) {
        int biggest = number;

        if (number1 > biggest) {
            biggest = number1;
        }
        if (number2 > biggest) {
            biggest = number2;
        }
        if (number3 > biggest) {
            biggest = number3;
        }
        if (number4 > biggest) {
            biggest = number4;
        }
        return biggest;
    }

    public int factors(int digit) {
        int count = 0;
        int factors = 1;

        while (factors <= digit) {
            if (digit % factors == 0) {
                count++;

            }
            factors++;
        }
        return count;
    }

    public boolean isPrime(int digit) {
       /* int number ,count = 0;
        for (number = 1; number <= digit; number++) {
            if (digit % number == 0)
                count++;}
        if (count <= 2 ){
            return true;
            }else {
            return false;
        }*/

    if (factors(digit)<= 2)return  true;
    return false;
    }


}