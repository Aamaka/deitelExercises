//package personalFun;
//
//import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//
//        for (int i = 1; i < number; i++) {
//
//
//            int product = (number - 1) * i;
//            System.out.println(product);
//        }
//        for(; true; ){
//            System.out.println("amaka");
//        }

//        for (int i = 1; i < 5; i++) {
//            System.out.println();
//            for (int j = 1; j <= 3; j++) {
//                System.out.print("*");
//            }
//        for (int i = 0; i < 3; i++) {
//            System.out.print("*");
//        }
//            for (int j = 0; j < 3; j++) {
//                System.out.print("1");
//            }
//        }
//        }

//package javaAssignment;

        import java.util.Scanner;

//public class SchoolExam {
//    public static void main(String[] args) {
//        int sum;
//        double average = 0;
//        double totalAverage = 0;
//        int totalSum = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of students: ");
//        int numberOfStudent = scanner.nextInt();
//        System.out.println("Enter number of subjects: ");
//        int numberOfSubjects = scanner.nextInt();
//
//        int[] scores = new int[numberOfSubjects + 1];
//        String[] studentName = new String[numberOfStudent + 1];
//        for(int i = 1; i <= numberOfSubjects; i++){
//            sum =0;
//            System.out.print("enter student name: ");
//            String name = scanner.next();
//            studentName[i] = name;
//
//            for (int j = 1; j <= numberOfSubjects; j++) {
//                System.out.print("Enter student score: ");
//                int studentScore = scanner.nextInt();
//                scores[j] = studentScore;
//
//                sum += studentScore;
//                average =(double) sum/numberOfSubjects;
//            }
//            System.out.println(sum);
//            System.out.println(average);
//
//            totalSum += sum;
//            totalAverage += average;
//
//        }