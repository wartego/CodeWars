package kyu8;

import java.util.*;
public class FindOddNumbers {
    public static int findIt(int[] a) {

        Map<Integer, Integer> mapa = new HashMap<>();
        for (int b : a
        ) {
            if (mapa.containsKey(b)) {
                int count = mapa.get(b);
                mapa.put(b, ++count);
            } else {
                mapa.put(b, 1);
            }
        }
        int odd = 0;
        for (Map.Entry<Integer, Integer> element : mapa.entrySet()) {
            if (element.getValue() % 2 != 0) {
                odd = element.getKey();
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        FindOddNumbers.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
    }
}
