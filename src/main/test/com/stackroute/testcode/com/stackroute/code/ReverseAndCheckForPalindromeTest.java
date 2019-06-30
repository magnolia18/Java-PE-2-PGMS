package com.stackroute.testcode.com.stackroute.code;
import static org.junit.Assert.*;
import org.junit.*;

public class ReverseAndCheckForPalindromeTest {

        private ReverseAndCheckForPalindromeTest rp;
        @Before
        public void setUp()
        {
            System.out.println("Before");
            rp = new ReverseAndCheckForPalindromeTest();
        }
        @After
        public void tearDown()
        {
            rp = null;
            System.out.println("After");
        }
        @Test
        public void test1()
        {

            assertEquals("Test failed",5);
            assertEquals("makam","makam");
        }

    }



