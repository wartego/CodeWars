package kyu8;

import java.util.Arrays;

public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        int N = Math.abs(n);
        Object[] tabCopy = null;
        int[] right = {4,0,1,2,3};
        int[] left = {1,2,3,4,0};

        if(n>0){
            for(int i = 0; i<N;i++){
                tabCopy = Arrays.copyOf(data,5);
                for (int j = 0; j < 5; j++) {
                    int ri = right[j];
                    Object value = tabCopy[ri];
                    data[j] = value ;
                }
            }
        } else{
            for(int i = 0; i<N;i++){
                tabCopy = Arrays.copyOf(data,5);
                for (int j = 0; j < 5; j++) {
                    int ri = left[j];
                    Object value = tabCopy[ri];
                    data[j] = value ;
                }
            }
        }
        return data;

    }

    public static void main(String[] args) {
        Rotator rotator = new Rotator();
        Object[] value = {1,2,4,5,7};
        rotator.rotate(value,2);
    }
}