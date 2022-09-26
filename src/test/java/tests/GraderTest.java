package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();

        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD(){
        var grader = new Grader();

        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC(){
        var grade = new Grader();

        assertEquals('C', grade.determineLetterGrade(79));
    }


    @Test
    void eightyNineShouldReturnB(){
        var grade = new Grader();
        assertEquals('B', grade.determineLetterGrade(89));
    }

    @Test
    void ninetyShouldReturnA(){
        var grade = new Grader();
        assertEquals('A', grade.determineLetterGrade(90));
    }

    @Test
    void ifLessThanZeroExpectedIllegalArgumentException(){

        var grade = new Grader();

        assertThrows(IllegalArgumentException.class, () -> grade.determineLetterGrade(-5));

    }

}