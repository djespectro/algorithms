package com.mac.algorithms.hackerrank.algorithm.warmup;

public class PlusMinus {

    public static void main(String[] args) {

        int[] arr = {-4, 3, -9, 0, 4, 1};

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int val : arr) {
            negativeCount += val < 0 ? 1 : 0;
            positiveCount += val > 0 ? 1 : 0;
            zeroCount += val == 0 ? 1 : 0;
        }
        float negativeFraction = (negativeCount / (float) arr.length);
        float positiveFraction = (positiveCount / (float) arr.length);
        float zeroFraction = (float) (zeroCount / (float) arr.length);

        System.out.println(String.format("%.6f", positiveFraction));
        System.out.println(String.format("%.6f", negativeFraction));
        System.out.println(String.format("%.6f", zeroFraction));

    }

}
