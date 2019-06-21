package com.mac.algorithms.interviewbootcamp.stringreversal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String word = "  abcd";
        System.out.println(solutionOne(word));
    }

    private static String solutionOne(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    private static String solutionTwo(String word) {
        return Arrays
                .stream(word.split(""))
                .reduce("", (reversed, character) -> character + reversed);
    }

    private static String solutionThree(String word) {
        String reversed = "";
        for (char c : word.toCharArray()) {
            reversed = c + reversed;
        }
        return reversed;
    }

    private static String solutionFour(String word) {
        String[] array = word.split("");
        String reversed = "";
        for (String c : array) {
            reversed = c + reversed;
        }
        return reversed;
    }

    private static String solutionFive(String word) {
        String[] array = word.split("");
        String[] reversed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - 1 - i] = array[i];
        }
        return String.join("", reversed);
    }

}
