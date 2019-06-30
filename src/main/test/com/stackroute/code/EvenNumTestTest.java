package com.stackroute.code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new EvenNumTest();
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
    public void givenAnEvenNumberShouldReturnTrue()
    {
        //Act

        Boolean result = obj.isEven(36);
        //Assert
        assertEquals("",true,result);

    }
    public void givenAOddNumberShouldReturnFalse()
    {
        //Act

        Boolean result = obj.isEven(35);
        //Assert
        assertEquals("",false,result);

    }

}