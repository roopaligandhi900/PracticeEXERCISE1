package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    Add num ;

    @Before
    public void setUp() throws Exception {
        num = new Add();
    }

    @After
    public void tearDown() throws Exception {
        num = null;
    }

    @Test
    public void Add() {
        int out = num.Add("42");
        assertEquals(42,out);


    }

}