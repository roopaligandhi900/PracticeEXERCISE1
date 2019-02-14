package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class nIterationTest {
    nIteration it ;

    @Before
    public void setUp() throws Exception {
        it = new nIteration();
    }

    @After
    public void tearDown() throws Exception {
        it = null;
    }

    @Test
    public void nIteration() {
        long outnum = it.nIteration(3);
        assertEquals(122333,outnum);
    }
}