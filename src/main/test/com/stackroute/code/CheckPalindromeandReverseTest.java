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

        String result = obj.validatePalindromeandReverse("363");
        //Assert
        assertEquals("","entered number is a palindrome",result);

    }
    @Test
    public void givenNumberShouldNotReturnAPalindrome()
    {
        //Act

        String result =obj.validatePalindromeandReverse("8838");
        //Assert
        assertEquals("","entered input is not a palindrome",result);


    }

    @Test
    public void givenNumberShouldReturnNotAPalindromePalindrome()
    {
        //Act

        String result = obj.validatePalindromeandReverse("madam");
        //Assert
        assertEquals("","entered input is a palindrome",result);


    }


}