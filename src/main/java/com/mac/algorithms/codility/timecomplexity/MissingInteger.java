package com.mac.algorithms.codility.timecomplexity;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MissingInteger {

    public static int solution(int[] A) {
        Set set = new HashSet();

        for (int i : A) {
            if (i > 0) {
                set.add(i);
            }
        }

        final int MAX_VALUE = 1_000_000;
        for (int i = 1; i <= MAX_VALUE; i++) {
            if (!set.contains(i)) return i;
        }

        return 1;
    }

    public static int solutionLowPerformance(int[] A) {
        int[] array = IntStream
                .of(A)
                .filter(value -> value > 0)
                .distinct()
                .sorted()
                .toArray();

        if (array.length == 0) return 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) return i + 1;
        }

        return array.length + 1;
    }

    public static void main(String[] args) {
//        int[] A = {1, 3, 6, 4, 1, 2};
//        int[] A = {1, 2, 3};
//        int[] A = new int[]{-1, -3};
        int[] A = new int[]{4, 5, 6, 2};


        System.out.println(solution(A));
    }
}
