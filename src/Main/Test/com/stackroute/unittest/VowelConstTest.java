package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConstTest {
    VowelConst vc ;

    @Before
    public void setUp() throws Exception {
        vc = new VowelConst();
    }

    @After
    public void tearDown() throws Exception {
        vc = null;
    }

    @Test
    public void VowelConst() {

        String out = vc.VowelConst("ili");
        assertEquals("Vowel Consonant Vowel ",out);
    }
}