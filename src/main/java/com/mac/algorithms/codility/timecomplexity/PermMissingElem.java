package com.mac.algorithms.codility.timecomplexity;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
 * which means that exactly one element is missing.
 * <p>
 * Your goal is to find that missing element.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A, returns the value of the missing element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 *
 * @notes: https://study.com/academy/lesson/finding-the-sum-of-consecutive-numbers.html
 */

public class PermMissingElem {

    public static int solution(int[] A) {
        long size = A.length + 1;
        long gaussNumber = (size + 1) * (size) / 2;
        for (int n : A) {
            gaussNumber -= n;
        }
        return (int) gaussNumber;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5, 8, 7, 9, 6, 10};
        System.out.println(solution(array));
    }

}
