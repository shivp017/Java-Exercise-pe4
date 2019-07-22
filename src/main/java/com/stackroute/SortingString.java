package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingString {

    public String sortString(String input) {
        if(input!=null){
            List<String> sort = new ArrayList();
            String[] inputArray = input.split(" ");
            for (int i = 0; i < inputArray.length;) {
                sort.add(inputArray[i]);

                i++;
            }
            Collections.sort(sort);
            StringBuffer sb = new StringBuffer();
            for (String s : sort) {
                sb.append(s);
                sb.append(" ");
            }
            return sb.toString().trim();

        }else {
            return null;
        }
    }

}
