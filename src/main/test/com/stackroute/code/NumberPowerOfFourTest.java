package com.stackroute.code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPowerOfFourTest {
    NumberPowerOfFour obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new NumberPowerOfFour();
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
    public void givenNumberIsANumberPowerOfFour()
    {
        //Act

        Boolean result = obj.checkNumber(16);
        //Assert
        assertEquals("",true,result);

    }
    public void givenNumberIsNotAPowerOfFour()
    {
        //Act

        Boolean result = obj.checkNumber(36);
        //Assert
        assertEquals("",false,result);

    }
    public void givenNumberIsNegative()
    {
        //Act

        Boolean result = obj.checkNumber(-1);
        //Assert
        assertEquals("",false,result);

    }

}