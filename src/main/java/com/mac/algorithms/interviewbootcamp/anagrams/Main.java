package com.mac.algorithms.interviewbootcamp.anagrams;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String wordA = "rail safety";
        String wordB = "fairy tales";
        System.out.println(solutionOne(wordA,wordB));
    }

    private static boolean solutionOne(String wordA, String wordB){
        String[] arrayWordA = wordA.replaceAll("\\W", "").split("");
        String[] arrayWordB = wordB.replaceAll("\\W", "").split("");
        Arrays.sort(arrayWordA);
        Arrays.sort(arrayWordB);
        return Arrays.equals(arrayWordA, arrayWordB);
    }

}
