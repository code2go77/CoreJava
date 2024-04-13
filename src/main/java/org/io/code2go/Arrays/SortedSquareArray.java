package org.io.code2go.Arrays;

import java.util.Arrays;

public class SortedSquareArray<sortedSquaredArray> {

    public static void main(String[] args) {
        int[] array = new int[]{-2, 6, 3, 4, -1};

        System.out.println(Arrays.toString(sortedSquaredArray(array)));
    }


    private static int[] sortedSquaredArray(int[] array) {
        int[] sortedsquare = new int[array.length];
        for (int idx = 0; idx < array.length; idx++) {
            int value = array[idx];
            sortedsquare[idx] = value * value;
        }
        Arrays.sort(sortedsquare);
        return sortedsquare;
    }

}
