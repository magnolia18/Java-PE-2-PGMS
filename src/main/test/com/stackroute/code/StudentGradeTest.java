package com.stackroute.code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {

    StudentGrade obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new StudentGrade();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test
    public void checkForGrades() {
        //Act
        int[] number = new int[]{1, 2, 3, 4};

        int result = obj.calculateGrades(number);
        //Assert
        assertEquals("", "", result);
    }

    @Test
    public void checkForGradesWithNegativeValuesSupplied() {
        //Act
        int[] number = new int[]{1, 2, -3, 4};

        int result = obj.calculateGrades(number);
        //Assert
        assertNotEquals("", "", result);
    }
}


