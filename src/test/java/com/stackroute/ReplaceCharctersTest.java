package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharctersTest {


  ReplaceCharcters replaceCharcters;


  @Before
    public  void setUp() {
      this.replaceCharcters = new ReplaceCharcters();
  }


  @After
    public  void tearDown(){
      this.replaceCharcters=null;
  }


    @Test
    public void givenInputShouldreplaceCharacters() {
        String expexted="faity fry";
        String actual=replaceCharcters.replaceCharacters("daily dry");
        assertEquals(expexted,actual);

    }

    @Test
    public void givenreplaceCharactersNotNull() {
        String actual=replaceCharcters.replaceCharacters("daily dry");
        assertNotNull(actual);

    }
    @Test
    public void givenInputNullShouldNull() {
        String actual=replaceCharcters.replaceCharacters(null);
        assertNull(actual);

    }

}