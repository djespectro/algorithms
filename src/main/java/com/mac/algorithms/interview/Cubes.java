package com.mac.algorithms.interview;

public class Cubes {

    public static int solution(int size) {

        if (size < 1) {
            throw new IllegalArgumentException("Size should be >= 1");
        }

        if (size == 1) {
            return size;
        }

        final int NUMBER_OF_CORNERS = 8;
        final int NUMBER_OF_SIDES   = 6;
        final int NUMBER_OF_EDGES   = 12;
        int n = size - 2;
        int paintedCubes = (n * n * NUMBER_OF_SIDES) + (n * NUMBER_OF_EDGES) + NUMBER_OF_CORNERS;

        return paintedCubes;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

}


