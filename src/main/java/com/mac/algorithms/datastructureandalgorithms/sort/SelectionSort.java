package com.mac.algorithms.datastructureandalgorithms.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int indexMaxValue = 0;
            for (int j = 1; j < i; j++) {
                if (array[j] > array[indexMaxValue]) {
                    indexMaxValue = j;
                }
            }
            swap(array, indexMaxValue, i);
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
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

}
