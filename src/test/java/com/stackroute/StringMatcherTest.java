package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatcherTest {
    MultipleOccurrences multipleOccurrences;

    @Before
    public void setUp() {

        this.multipleOccurrences=new MultipleOccurrences();
    }

    @After
    public  void tearDown(){

        this.multipleOccurrences=null;
    }



    @Test
    public void givenShouldReturnmatchedIndex() {
        String expected="Found : 4 - 6\n" +
                "Found : 10 - 12\n" +
                "Found : 27 - 29";
        String actual=multipleOccurrences.matchString("She sells seashells by the seashore","se");
        assertEquals(expected,actual);
    }
    @Test
    public void givenInputStringShouldNotBeNull() {
        String actual=multipleOccurrences.matchString("She sells seashells by the seashore se","se");
        assertNotNull(actual);
    }
}