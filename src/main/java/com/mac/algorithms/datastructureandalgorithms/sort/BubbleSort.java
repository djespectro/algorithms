package com.mac.algorithms.datastructureandalgorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int left, int right) {
        if (left == right) {
            return;
        }

        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1 , -22};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

}
