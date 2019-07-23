package com.stackroute;
/*Write a java program to count the total number of occurrences of a given character in a string
without using any loop?
For Example- Java is java again java again count number of occurrence of a in the given string

 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrences {

    public String matchString(String inputString,String givenString){
        StringBuilder string=new StringBuilder();
        Pattern pattern= Pattern.compile(givenString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find()){
            string.append("Found : ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return string.toString().trim();
    }


}
