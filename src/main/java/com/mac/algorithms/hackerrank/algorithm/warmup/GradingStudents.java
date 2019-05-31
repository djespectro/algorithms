package com.mac.algorithms.hackerrank.algorithm.warmup;

public class GradingStudents {


    public static void main(String[] args) {

        int[] grades = {73, 67, 38, 33, 74};

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                grades[i] = (grades[i] % 5 < 3) ? grades[i] : grades[i] + ( 5 -(grades[i] % 5));
            }
        }

        System.out.println(grades);

    }

}
