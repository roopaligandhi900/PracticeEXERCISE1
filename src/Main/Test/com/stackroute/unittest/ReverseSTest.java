package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseSTest {
    ReverseS rv ;

    @Before
    public void setUp() throws Exception {
        rv = new ReverseS();
    }

    @After
    public void tearDown() throws Exception {
        rv = null;
    }

    @Test
    public void TestReverseS() {
        String outdata = rv.ReverseS("roopali");
        assertEquals("ilapoor",outdata);

    }
}