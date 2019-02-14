package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    Tomjerry tj ;

    @Before
    public void setUp() throws Exception {
        tj = new Tomjerry();
    }

    @After
    public void tearDown() throws Exception {
        tj = null;
    }

    @Test
    public void tomjerry() {

        String val = tj.tomjerry(21);
        assertEquals("Tom",val);
    }
}