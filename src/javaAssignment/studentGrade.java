package javaAssignment;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  aGradeCount = 0;
        int  bGradeCount = 0;
        int  cGradeCount = 0;
        int  dGradeCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("enter student name: ");
            input.next();

            System.out.println("enter student grade: ");
            String studentGrade = input.next().toUpperCase();


            switch (studentGrade) {
                case "A" -> aGradeCount++;
                case "B" -> bGradeCount++;
                case "C" -> cGradeCount++;
                case "D" -> dGradeCount++;
                default -> System.out.println("input only letters from A-D");
            }
        }
            System.out.println(aGradeCount+ "grade A");
            System.out.println(bGradeCount+ "grade B");
            System.out.println(cGradeCount+ "grade C");
            System.out.println(dGradeCount+ "grade D");



    }


}
