package com.mac.algorithms.hackerrank.algorithm.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,7,7,9};

        int size = arr.length;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(Integer.valueOf(arr[i]));
        }

        Collections.sort(list);
        Long min = 0l;
        for (int i = 0; i < size - 1; i++) {
            min += list.get(i);
        }

        Collections.sort(list, Collections.reverseOrder());

        Long max = 0l;
        for (int i = 0; i < size - 1; i++) {
            max+= list.get(i);
        }

        System.out.println(min + " " + max);

    }

}
