package kyu8;

import java.util.ArrayList;
import java.util.List;

public class ExpandedForm
{
    public static String expandedForm(int num)
    {
        String value = String.valueOf(num);
        String text = " ";
        int tempValue = 0;
        int counter = 10;
        List<String> tablica = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            tempValue = num%counter;
            if(tempValue != 0){
                tablica.add(0, String.valueOf(tempValue));
            }

            num -= tempValue;
            counter *=10;
        }
        String textEnd = null;

             textEnd = String.join(" + ", tablica);

        return textEnd;
    }

    public static void main(String[] args) {
        String s = ExpandedForm.expandedForm(12);
        System.out.println(s);
    }
}