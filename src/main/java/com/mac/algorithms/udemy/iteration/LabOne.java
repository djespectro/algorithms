package com.mac.algorithms.udemy.iteration;

import java.util.stream.IntStream;

public class LabOne {


    public static void test1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) System.out.print("*");
                else System.out.print(".");
            }
            System.out.println();
        }
    }

    public static void test2(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > 0; j--) {
                if (i >= j) System.out.print("*");
                else System.out.print(".");
            }
            System.out.println();
        }
    }

    public static void test3(int size) {

        int j = size;

        for ( ; j >= 0; j--) {

            int finalJ = j;

            IntStream.range(0, 10 -j ).forEach(s -> {
                System.out.print(".");
            });

            IntStream.range(0, 2*j-1).forEach(s -> {
                System.out.print("*");
                if(s == 2*finalJ -2) {
                    System.out.println();
                }});
        }


    }

    public static void test4(int size) {


        for (int j = 1 ; j <= size; j++) {

            int finalJ = j;

            IntStream.range(0, 10 - j ).forEach(s -> {
                System.out.print(".");
            });

            IntStream.range(0, 2*j-1).forEach(s -> {
                System.out.print("*");
                if(s == 2*finalJ-2) {
                    System.out.println();
                }});
        }


    }

    public static void main(String[] args) {

//        test1(10);
//        test2(10);
//        test3(10);
        test4(10);

    }
}
