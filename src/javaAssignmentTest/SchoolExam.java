package javaAssignmentTest;

import java.util.Scanner;

public class SchoolExam {
    public static void main(String[] args) {
        int sum;
        double average = 0;
        double totalAverage = 0;
        int totalSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudent = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int[] scores = new int[numberOfSubjects];
        String[] studentName = new String[numberOfStudent];
        int[] sumOfScores = new int[numberOfStudent];
        double[] averageScores = new double[numberOfStudent];
        for(int i = 0; i < numberOfStudent; i++){
            sum =0;
            System.out.print("enter student name: ");
            String name = scanner.next();
            studentName[i] = name;

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter student score: ");
                int studentScore = scanner.nextInt();
                scores[j] = studentScore;

                sum += studentScore;
                sumOfScores[i] = sum;
                average =(double) sum/numberOfSubjects;
                averageScores[i] = average;
            }
            System.out.println(sum);
            System.out.println(average);

         totalSum += sum;
         totalAverage += average;

        }
//        System.out.println(totalSum);
//        System.out.println(totalAverage);
        System.out.println("**************************************************************************");

        System.out.printf("%s", "STUDENTS");

        for(int i = 0; i < numberOfSubjects; i++){
            System.out.print("      SUB" + (i + 1) );
        }
        System.out.print("        TOT     AVG     POS");
        System.out.println();
        System.out.println("**************************************************************************");


        for(int i = 0; i < numberOfStudent; i++){
            System.out.print(studentName[i] + "             ");
            for(int j = 0; j < numberOfSubjects; j++){
                System.out.print(scores[j] + "          ");
            }
            for(int j = 0; j < 1; j++){
                System.out.print(sumOfScores[i] + "     ");
            }
            for(int j = 0; j < 1; j++){
                System.out.printf("%.2f    ", averageScores[j]);

            }
            System.out.println();
        }
        System.out.println("**************************************************************************");

    }

}
