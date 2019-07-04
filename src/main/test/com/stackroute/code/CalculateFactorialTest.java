package com.stackroute.code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFactorialTest {


    public class FactorialTest {

        CalculateFactorial obj;

        @Before
        public void setUp() {
            System.out.println("Before");
            obj = new CalculateFactorial();
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
        public void givenNumberGivesFactorial() {
            //Act
            int result = obj.calculateFactorial(4);
            //Assert
            assertEquals("", 24, result);

        }

        public void givenNumberZeroReturnsFactorialOne() {
            //Act

            int result = obj.calculateFactorial(0);
            //Assert
            assertEquals("", 1, result);

        }

        public void givenNumberOneReturnsFactorialZero() {
            //Act

            int result = obj.calculateFactorial(1);
            //Assert
            assertEquals("", 0, result);

        }

        public void givenNegativeNumberReturnsNothing() {
            //Act

            int result = obj.calculateFactorial(-1);
            //Assert
            assertEquals("", result);

        }

        public void givenLongNumberReturnsFactorial() {
            //Act

            long result = obj.calculateFactorialOfNumber(20);
            //Assert
            assertEquals("2432902008176640000", result);

        }

        public void givenLongNumberReturnsFactorialError() {
            //Act

            long result = obj.calculateFactorial(23);
            //Assert
            assertEquals("", result);

        }
    }
}
