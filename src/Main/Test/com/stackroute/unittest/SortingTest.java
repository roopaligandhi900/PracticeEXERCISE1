package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sort ;

    @Before
    public void setUp() throws Exception {
        sort = new Sorting();
    }

    @After
    public void tearDown() throws Exception {
        sort = null;
    }

    @Test
    public void Sorting() {
        int outnum = sort.Sorting(56789);
        assertEquals(98765,outnum);

    }
}