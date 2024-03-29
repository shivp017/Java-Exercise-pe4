package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrencesTest {

    Occurrences occurrences;

    @Before
    public void setUp() {

        this.occurrences=new Occurrences();
    }

    @After
    public  void tearDown(){

        this.occurrences=null;
    }

    @Test
    public void givenInputStringShouldReturnCharacterOccurrenceCount() {
        int expected=10;
        int actualInput=occurrences.characterCount("Java is java again java again",'a');
        assertEquals(expected,actualInput);
    }

    @Test
    public void givenInputStringShouldReturnCharacterOccuranceCountFailure() {
        int expected=10;
        int actualInput=occurrences.characterCount("Java is java again java again",'J');
        assertNotEquals(expected,actualInput);
    }

    @Test
    public void givenInputStringShouldNotbeNull() {
        int actualInput=occurrences.characterCount("Java is java again java again",'J');
        assertNotNull(actualInput);
    }




}