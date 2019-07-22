package com.stackroute;

public class Occurrences {

    public int characterCount(String inputString,char characterInput){
        return inputString.length()-inputString.replaceAll(String.valueOf(characterInput),"").length();
    }
}
