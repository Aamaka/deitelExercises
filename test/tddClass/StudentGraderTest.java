package tddClass;


import org.junit.jupiter.api.Test;
import personalFun.StudentGrader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGraderTest {

//    @Test
//    public void testArray() {
//        int[][] arr = {{1, 2, 3, 4, 5, 6},
//                {7, 8, 9, 10, 11, 12}};
//        StudentGrader grade = new StudentGrader(arr);
//        assertEquals(21, grade.getSum(0));
//    }
//
//    @Test
//    public void testArray2() {
//        int[][] arr = {{1, 2, 3, 4, 5, 6},
//                {5, 6, 10, 4}};
//        StudentGrader grade = new StudentGrader(arr);
//        assertEquals(25, grade.getSum(1));
//    }

    @Test
    public void setArray() {
        StudentGrader grade = new StudentGrader();
        grade.setNoOfStudent(3);
        grade.setNoOfSubject(3);
        int[][] arr = new int[grade.getNoOfStudent()][grade.getNoOfSubject()];
        assertEquals(3,arr.length);

    }
}