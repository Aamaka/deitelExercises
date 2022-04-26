package tddClass;

public class StudentsGrade {

    private  int[][] grade = new int[4][5];

    public StudentsGrade(int[][] grade) {
        this.grade = grade;
    }

    public int getSum(int indexNumber) {
        int sum = 0;
        for (int i = 0; i < grade[indexNumber].length; i++) {
            sum+= grade[indexNumber][i];
        }
        return sum;

    }
    public double getAverage(int indexNumber) {

        return  (double) getSum(indexNumber)/ grade[indexNumber].length;
    }

    public int getPosition(int indexNumber) {
        //get the sum
        int [] arrayOfStudentSum = new int[grade.length];
        for (int student = 0; student < grade.length; student++) {
//            for (int subject = 0; subject < grade[subject].length; subject++) {
//                sum+= grade[student][subject];

            //store the sum in an array
            arrayOfStudentSum[student] = getSum(student);

        }

        //store the sum in an array
        //sort in descending order
        //get the index of the student using the sum
        //add one to the index
        return 0;
    }
}
