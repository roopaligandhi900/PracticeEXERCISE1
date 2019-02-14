package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGuessTest {
    NumberGuess ng ;

    @Before
    public void setUp() throws Exception {
        ng = new NumberGuess();
    }

    @After
    public void tearDown() throws Exception {
        ng = null;
    }

    @Test
    public void NumberGuess() {
        String outdata = ng.NumberGuess(10,32);
        assertEquals("less",outdata);

    }
}