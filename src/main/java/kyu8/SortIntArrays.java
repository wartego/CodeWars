package kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class SortIntArrays {
    public static void main(String[] args) {
        largest(4,new int[]{3, 4, 5, 6, 7});
    }
    public static int[] largest(int n, int[] arr) {

        int[] toArray = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int[] ints = Arrays.stream(toArray).limit(n).toArray();


        Arrays.sort(ints);


        System.out.println(ints);
        return new int[]{};
    }
}
