package com.stackroute;

/*Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry

 */

public class ReplaceCharcters {

        public String replaceCharacters(String inputString){
            if(inputString==null){
                return null;
            }
            String resultString=inputString.replaceAll("d","f");
            return resultString.replaceAll("l","t");
        }
}
