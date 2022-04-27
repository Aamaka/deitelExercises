package classActivities;

import java.util.Scanner;

public class ArraysOfStudentsGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("enter number of subjects offered: ");
        int numberOfSubjectOffered = input.nextInt();

        int[][] scores = new int[numberOfStudents][numberOfSubjectOffered];
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfSubjectOffered; j++) {
                System.out.println("Students score: ");
                scores[i][j] = input.nextInt();

            }

        }
        for (int k = 0; k < numberOfStudents; k++) {
            for (int l = 0; l < numberOfSubjectOffered; l++) {
                System.out.print(scores[k][l]+ " ");
            }
            System.out.println();

        }

        }
    }

