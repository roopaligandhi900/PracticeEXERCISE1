package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatTest {
    Repeat rp ;

    @Before
    public void setUp() throws Exception {
        rp = new Repeat();
    }

    @After
    public void tearDown() throws Exception {
        rp = null;
    }

    @Test
    public void TestReverseS() {
        String out = rp.Repeat("roopali",2);
        assertEquals("roopalilili",out);

    }
}