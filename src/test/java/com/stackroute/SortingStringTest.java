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
    public void givenInputStringshouldReturnTranspose() {
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String actualInput=transposeString.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,actualInput);
    }
    }

}