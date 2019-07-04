package com.mac.algorithms.interviewbootcamp.capitalize;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println(solutionFour("mario alberto cardenas garibay"));
    }

    private static String solutionOne(String word) {

        String[] array = word.split(" ");

        for (int i = 0; i < array.length; i++) {
            String letter = array[i].substring(0, 1);
            array[i] = array[i].replace(letter, letter.toUpperCase());
        }

        return String.join(" ", array);
    }

    private static String solutionTwo(String word) {
        String[] array = word.split(" ");

        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toUpperCase(array[i].toCharArray()[0]) + array[i].substring(1);
        }

        return String.join(" ", array);
    }

    private static String solutionThree(String word) {
        List<String> list = Stream
                .of(word.split(" "))
                .map(w -> w.replace(w.substring(0, 1), w.substring(0, 1).toUpperCase()))
                .collect(Collectors.toList());

        return String.join(" ", list);
    }

    private static String solutionFour(String word) {
        char[] character = word.toCharArray();

        StringBuilder result = new StringBuilder(character.length);
        result.append(Character.toUpperCase(character[0]));

        for (int i = 1; i < character.length; i++) {
            if (character[i - 1] == ' ') {
                result.append(Character.toUpperCase(character[i]));
            } else {
                result.append(character[i]);
            }
        }

        return String.join(" ", result.toString());
    }

}
