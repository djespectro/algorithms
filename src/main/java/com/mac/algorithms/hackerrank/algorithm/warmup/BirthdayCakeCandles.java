package com.mac.algorithms.hackerrank.algorithm.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        int[] ar = {3, 2, 1, 3,5,3};

        List<Integer> list = new ArrayList<>();
        for(int val : ar){
            list.add(val);
        }

        Collections.sort(list, Collections.reverseOrder());

        int count = 0;
        for (int val : list) {
            count += list.get(0) == val ? 1 : 0;
        }

        System.out.println(count);

    }

}
