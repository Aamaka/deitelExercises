package personalFun;

public class StudentGrader {

    //private  int[][] arr;

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public int getNoOfSubject() {
        return noOfSubject;
    }

    public void setNoOfSubject(int noOfSubject) {
        this.noOfSubject = noOfSubject;
    }

    private int noOfStudent;
    private  int noOfSubject;

//
//    public StudentGrader(int[][] arr) {
//        this.arr = arr;
//    }

//    public int getSum(int indexNumber) {
//        int total = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < arr[indexNumber].length; j++) {
//                sum += arr[i][j];
//            }
//            total = sum;
//
//        }
//        return total;
//    }
}
