package kyu8;

import java.util.*;

public class ReversedWords {
    public static String reverseWords(String str){
        List<String> table = new ArrayList<>(List.of(str.split(" ")));

        String text = "";
        for (int i = 1; i < table.size(); i++) {
            String value = table.get(table.size()-1);
            table.remove(table.size()-1);
            table.add(i-1,value);
        }
        for(String value : table){
            text+= value + " ";
        }
        return text.trim();

    }
    }


