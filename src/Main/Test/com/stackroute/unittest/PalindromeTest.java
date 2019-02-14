package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome pa ;

    @Before
    public void setUp() throws Exception {
        pa = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        pa = null;
    }

    @Test
    public void Palindrome() {

        String outdata = pa.Palindrome(12345);
        assertEquals("not a palindrome",pa.Palindrome(12345));
    }
}