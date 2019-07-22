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
    public void givenInputisHarryHere() {
        boolean expected=true;
        boolean actual=regularExpression.isHarry("This is harry.");
        assertEquals(expected,actual);

    }
    @Test
    public void givenInputisHarryHereFail() {
        boolean expected=false;
        boolean actual=regularExpression.isHarry("This is henry.");
        assertEquals(expected,actual);

    }
    @Test
    public void givenInputisHarryHereNotNull() {

        boolean actual=regularExpression.isHarry("This is henry.");
        assertNotNull(actual);

    }
}