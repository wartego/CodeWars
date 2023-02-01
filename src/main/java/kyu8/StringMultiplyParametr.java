package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringMultiplyParametr {
    public static void main(String[] args) {
        String s = buildString("Cheese", "Milk", "Chocolate");
        System.out.println(s);
    }
    public static String buildString(String... args)
    {
        return Arrays.stream(args).map(String::toString).collect(Collectors.joining(", ","I like ","!"));
    }
}
