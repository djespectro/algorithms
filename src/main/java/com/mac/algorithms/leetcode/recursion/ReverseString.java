package main.java.com.mac.algorithms.leetcode.recursion;

import java.util.Arrays;
import java.util.Collections;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * You may assume all the characters consist of printable ascii characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 * <p>
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

public class ReverseString {

    public static void reverseString(char[] s) {
        int rightPosition = s.length - 1;
        for (int leftPosition = 0; leftPosition < rightPosition; leftPosition++, rightPosition--) {
            char temp = s[leftPosition];
            s[leftPosition] = s[rightPosition];
            s[rightPosition] = temp;
        }
    }

    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        reverseString(word);
    }

}
