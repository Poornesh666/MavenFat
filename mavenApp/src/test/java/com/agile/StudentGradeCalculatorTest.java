package com.agile;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeCalculatorTest {
    private StudentGradeCalculator calculator;

    @Before
    public void setUp() {
        calculator = new StudentGradeCalculator();
    }

    @Test
    public void testGradeA() {
        String grade = calculator.calculateGrade(95);
        assertEquals("A", grade);
    }

    @Test
    public void testGradeB() {
        String grade = calculator.calculateGrade(85);
        assertEquals("B", grade);
    }

    @Test
    public void testGradeC() {
        String grade = calculator.calculateGrade(75);
        assertEquals("C", grade);
    }

    @Test
    public void testGradeD() {
        String grade = calculator.calculateGrade(65);
        assertEquals("D", grade);
    }

    @Test
    public void testGradeF() {
        String grade = calculator.calculateGrade(50);
        assertEquals("F", grade);
    }

    @Test
    public void testBoundaryGradeA() {
        String grade = calculator.calculateGrade(90);
        assertEquals("A", grade);
    }

    @Test
    public void testBoundaryGradeB() {
        String grade = calculator.calculateGrade(80);
        assertEquals("B", grade);
    }

    @Test
    public void testBoundaryGradeC() {
        String grade = calculator.calculateGrade(70);
        assertEquals("C", grade);
    }

    @Test
    public void testBoundaryGradeD() {
        String grade = calculator.calculateGrade(60);
        assertEquals("D", grade);
    }

    @Test
    public void testZeroScore() {
        String grade = calculator.calculateGrade(0);
        assertEquals("F", grade);
    }

    @Test
    public void testPerfectScore() {
        String grade = calculator.calculateGrade(100);
        assertEquals("A", grade);
    }
}