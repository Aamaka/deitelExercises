package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsGradeTest {
    private StudentsGrade report;
    @BeforeEach
    public void startWith(){
        int [][] grade = {{4, 5,6,3}, {5, 6, 10},{5,5,6}};
        report = new StudentsGrade(grade);
    }

    @Test
    public void sumOfScoresPerStudentTest(){
        assertEquals(18,report.getSum(0));
        assertEquals(21, report.getSum(1));
        assertEquals(16,report.getSum(2));

    }

    @Test
    public void testForAverage(){
        assertEquals(4.5,report.getAverage(0));
        assertEquals(7.0,report.getAverage(1));
    }

    @Test
    public void testForPosition(){
        assertEquals(2,report.getPosition(0));

    }


}
