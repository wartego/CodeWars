package kyu8;

import java.util.Arrays;
import java.util.Comparator;

public class SortCards {

    private static final String order = "A23456789TJQK";

    public static String[] sortCards (String[] cards) {
        Arrays.sort(cards, Comparator.comparingInt(order::indexOf));
        return cards;
    }

}
