package com.mac.algorithms.interviewbootcamp.chunk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
//        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] result = solutionTwo(array, 3);

        for (int[] a : result) {
            System.out.println(Arrays.toString(a));
        }

    }

    private static int[][] solutionOne(int[] array, int size) {
        int chunk = (int) Math.ceil((float) array.length / size);
        int[][] result = new int[chunk][size];

        int index = 0;
        for (int i = 0; i < chunk; i++) {
            result[i] = Arrays.copyOfRange(array, index, index + size);
            index += size;
        }

        return result;
    }

//    private static int[][] solutionTwo(int[] array, int size) {
////        int chunk = (array.length % size) == 0 ? array.length / size : array.length / size + 1;
//        int chunk = (int)Math.ceil((float) array.length/size);
//
//        int[][] result = new int[chunk][size];
//
//        int indexA = 0;
//        int indexB = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            result[indexA][indexB] = array[i];
//            indexB++;
//            if (indexB % size == 0) {
//                indexA++;
//                indexB = 0;
//            }
//
//        }
//
//        return result;
//    }


}
