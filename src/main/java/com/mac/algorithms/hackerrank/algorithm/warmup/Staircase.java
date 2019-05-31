package com.mac.algorithms.hackerrank.algorithm.warmup;

public class Staircase {

    public static void main(String[] args) {

        int n = 6;

        for (int j = n; j > 0; j--) {
            for (int i = 0; i < n; i++) {
                if (i < j - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }

}
