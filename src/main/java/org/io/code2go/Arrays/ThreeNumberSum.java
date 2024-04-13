package org.io.code2go.Arrays;

import java.util.*;
import java.util.stream.Stream;

public class ThreeNumberSum {

    public static void main(String[] args) {

        int[] array = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 18;
        /*for (Object[] out: threeNumberSum(array, targetSum)){
            System.out.println(Arrays.toString(out));
        }*/
        System.out.println(Arrays.deepToString(threeNumberSum(array, targetSum).toArray()));

    }

    private static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        int n = array.length - 1;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n;
            while (j < k) {
                if (array[i] + array[j] + array[k] == targetSum) {
                    result.add(new Integer[]{array[i], array[j], array[k]});
                    j++;
                } else if (array[i] + array[j] + array[k] < targetSum) {
                    j++;
                } else
                    k--;
            }
        }
        return result;
    }


}
