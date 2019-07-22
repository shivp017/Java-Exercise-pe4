package com.stackroute;

public class ReplaceCharcters {

        public String replaceCharacters(String inputString){
            if(inputString==null){
                return null;
            }
            String resultString=inputString.replaceAll("d","f");
            return resultString.replaceAll("l","t");
        }
}
