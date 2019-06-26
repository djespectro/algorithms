package com.mac.algorithms.interviewbootcamp.palindromes;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String word = "abba";
        System.out.println(solutionThree(word));
    }

    private static boolean solutionOne(String word) {
        char[] character = word.toCharArray();
        for (int i = 0; i < character.length / 2; i++) {
            if (character[i] != character[character.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean solutionTwo(String word) {
        return new StringBuilder(word)
                .reverse()
                .toString()
                .equals(word);
    }

    private static boolean solutionThree(String word) {
        return IntStream
                .range(0, word.length() / 2)
                .allMatch(i -> word.charAt(i) == word.charAt(word.length() - 1 - i));
    }

}

