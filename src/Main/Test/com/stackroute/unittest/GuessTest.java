package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTest {
    Guess ab ;

    @Before
    public void setUp() throws Exception {
        ab = new Guess();
    }

    @After
    public void tearDown() throws Exception {
        ab = null;
    }

    @Test
    public void Guess() {

        String outdata = ab.Guess('C');
        assertEquals("Upper case",outdata);
    }


}