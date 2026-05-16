package com.example.gradecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {

    GradeCalculator calc = new GradeCalculator();

    @Test
    public void testHD() {
        assertEquals("HD", calc.calculateGrade(90));
    }

    @Test
    public void testD() {
        assertEquals("D", calc.calculateGrade(80));
    }

    @Test
    public void testC() {
        assertEquals("C", calc.calculateGrade(70));
    }

    @Test
    public void testP() {
        assertEquals("P", calc.calculateGrade(60));
    }

    @Test
    public void testF() {
        assertEquals("F", calc.calculateGrade(40));
    }

    @Test
    public void testInvalid() {
        assertEquals("Invalid Marks", calc.calculateGrade(-5));
        assertEquals("Invalid Marks", calc.calculateGrade(105));
    }
}