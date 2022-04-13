package chapter5.chapter6;

public class Division {
    public boolean mode;

    public void setDivisibleNumbers(int num1,int num2 ,int num3,int num4,int num5,int num6,int num7, int num8,int num9 , int num10) {
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1 -> mode = num1 % 5 == 0;
                case 2 -> mode = num2 % 5 == 0;
                case 3 -> mode = num3 % 5 == 0;
                case 4 -> mode = num4 % 5 == 0;
                case 5 -> mode = num5 % 5 == 0;
                case 6 -> mode = num6 % 5 == 0;
                case 7 -> mode = num7 % 5 == 0;
                case 8 -> mode = num8 % 5 == 0;
                case 9 -> mode = num9 % 5 == 0;
                case 10 -> mode = num10 % 5 == 0;
            }
        }


    }

    public boolean isDivisible() {
        return mode;
    }
    }
