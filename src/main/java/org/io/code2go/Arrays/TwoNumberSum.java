package org.io.code2go.Arrays;

import java.util.Arrays;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] array = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 11;

        System.out.println(Arrays.toString(twoNumberSum(array, targetSum)));
    }

    private static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int j = i;
            int k = array.length - 1;
            while (j < k) {
                if (array[j] + array[k] == targetSum) {
                    return new int[]{array[j], array[k]};
                } else if (array[j] + array[k] < targetSum) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return new int[0];
    }
}
