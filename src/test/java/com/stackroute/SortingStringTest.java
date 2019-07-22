package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingStringTest {

    SortingString sortingString;

    @Before
    public void setUp() {

        this.sortingString=new SortingString();
    }

    @After
    public  void tearDown(){

        this.sortingString=null;
    }

    @Test
    public void givenInputStringshouldSortString() {
        String expected="a aa aabbc";
        String actualInput=sortingString.sortString("aabbc aa a");
        assertEquals(expected,actualInput);
    }

    @Test
    public void givenInputStringshouldFail() {
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String actualInput=sortingString.sortString("Java is java again java again");
        assertNotEquals(expected,actualInput);
    }

    @Test
    public void givenInputStringShouldNotBeNull() {
        String actualInput=sortingString.sortString("aabbc aa a ccc");
        assertNotNull(actualInput);
    }

}