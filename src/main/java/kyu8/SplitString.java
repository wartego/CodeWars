package kyu8;

public class SplitString {
    public static void main(String[] args) {
        toCamelCase("the-stealth-warrior");
    }

    static String toCamelCase(String s){
        //check if String is null
        if(s.equals(null) || s.equals("")){
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        String splitChar = s.contains("-") ? "-" : "_";
        String[] splitTable = s.split(splitChar);
        String va = splitTable[0];
        char first = va.charAt(0);

        //check first row in table
        if(first >= 97 && first<=122){
            stringBuilder.append(va);
        } else {
            String firstChar = va.substring(0, 1);
            String restString = va.substring(1, va.length());
            String firstUpperCase = firstChar.toUpperCase();
            stringBuilder.append(firstUpperCase).append(restString);
        }


 // rest words in table
        for (int i = 1; i< splitTable.length  ; i++) {
            String firstChar = splitTable[i].substring(0, 1);
            String restString = splitTable[i].substring(1, splitTable[i].length());
            String firstUpperCase = firstChar.toUpperCase();
            stringBuilder.append(firstUpperCase).append(restString);

        }
        return stringBuilder.toString();
    }
}