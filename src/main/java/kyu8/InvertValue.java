package kyu8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InvertValue {
    public static int[] invert(int[] array) {
        int[] ints = Arrays.stream(array).
                map(s -> s * -1)
                .toArray();
        return ints;
    }

}
