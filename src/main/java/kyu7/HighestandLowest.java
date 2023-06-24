package kyu7;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class HighestandLowest {
    public static String highAndLow(String numbers) {
        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer::valueOf).toArray();
        OptionalInt min = Arrays.stream(array).min();
        OptionalInt max = Arrays.stream(array).max();



        return max.getAsInt()+ " " +  min.getAsInt();
    }
}
