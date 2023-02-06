package kyu8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncrementString {
    public static void main(String[] args) {
        System.out.println(incrementString(""));
    }
    public static String incrementString(String str) {

        if(str == null || str.isEmpty() ){
            return "1";
        }
        Pattern pattern = Pattern.compile("[A-Za-z]*(0+)");
        Matcher matcher = pattern.matcher(str);
        String digits = null;
        String beginText = null;
        boolean check = matcher.matches();
        if(check){
             digits = str.replaceAll("[A-Za-z]*0?", "");
             beginText = str.replace(digits,"");
             int digitAfterPlus1 = Integer.parseInt(digits);
             digitAfterPlus1++;
             String textDigitAfterPlus1 = String.valueOf(digitAfterPlus1);
             if(digits.length()< textDigitAfterPlus1.length()){
                 return beginText.substring(0,beginText.length()-1) + textDigitAfterPlus1;
             } else {
                 return  beginText + textDigitAfterPlus1;
             }

        } else if (!str.replaceAll("[A-Za-z]*","").isEmpty()) {
            digits = str.replaceAll("[A-Za-z]*", "");
            beginText = str.replace(digits,"");
            int digitAfterPlus1 = Integer.parseInt(digits);
            digitAfterPlus1++;
            String textDigitAfterPlus1 = String.valueOf(digitAfterPlus1);
            return  beginText + textDigitAfterPlus1;

        } else{

            return str + "1";
        }

    }
}
