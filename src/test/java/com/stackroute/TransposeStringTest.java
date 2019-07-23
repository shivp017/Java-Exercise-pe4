package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString transposeString;


    @Before
    public void setUp() {

        this.transposeString=new TransposeString();
    }

    @After
    public  void tearDown(){

        this.transposeString=null;
    }

    @Test
    public void givenInputStringShouldReturnTranspose() {
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String actualInput=transposeString.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,actualInput);
    }

    @Test
    public void givenInputStringShouldFail() {
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String actualInput=transposeString.transpose("Java is java again java again");
        assertNotEquals(expected,actualInput);
    }

    @Test
    public void givenInputStringShouldNotBeNull() {
        String actualInput=transposeString.transpose("Java is java again java again");
        assertNotNull(actualInput);
    }



}