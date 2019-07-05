package com.stackroute.code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeandReverseTest {

    CheckPalindromeandReverse obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new CheckPalindromeandReverse();
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
    public void givenNumberShouldReturnPalindrome()
    {
        //Act

        String result = obj.checkPalindrome("363");
        //Assert
        assertEquals("Entered input is a palindrome",result);

    }
    @Test
    public void givenNumberShouldNotReturnAPalindrome()
    {
        //Act

        String result = obj.checkPalindrome("8038");
        //Assert
        assertEquals("Entered input is not a palindrome",result);


    }

    @Test
    public void givenNumberShouldReturnNotAPalindrome()
    {
        //Act

        String result = obj.checkPalindrome("kaam");
        //Assert
        assertEquals("","Entered input is not a palindrome",result);


    }


}