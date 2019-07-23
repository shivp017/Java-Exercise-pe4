package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {

    RegularExpression regularExpression;

    @Before
    public  void setUp(){

        this.regularExpression=new RegularExpression();
    }

    @After
    public void tearDown(){

        this.regularExpression=null;

    }
    @Test
    public void givenInputStringShouldReturnTrue() {
        boolean expected=true;
        boolean actual=regularExpression.isHarry("This is Harry.");
        assertEquals(expected,actual);

    }
    @Test
    public void givenInputStringShouldReturnFalse() {
        boolean expected=false;
        boolean actual=regularExpression.isHarry("This is Henry.");
        assertEquals(expected,actual);

    }
    @Test
    public void givenInputStringShouldReturnNotNull() {

        boolean actual=regularExpression.isHarry("This is Henry.");
        assertNotNull(actual);

    }
}