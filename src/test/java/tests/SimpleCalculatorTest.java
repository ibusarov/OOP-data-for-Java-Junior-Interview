package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @BeforeEach
    public void setUp(){
        this.calculator = new SimpleCalculator();
    }


    @Test
    public void twoPlusFiveShouldReturnSeven(){

        assertEquals(7, calculator.add(5,2) );
    }

    @Test
    void twoPlusTwoEqualsFour(){
        assertTrue(calculator.add(2,2) == 4);
    }

}