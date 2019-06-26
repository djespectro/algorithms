package com.mac.algorithms.interviewbootcamp.reverseint;

public class Main {

    public static void main(String[] args) {
        int number = -51;
        System.out.println(solutionOne(number));
    }

    private static int solutionOne(int number) {
        int sign = Integer.signum(number);
        number *= sign;

        String reversedStringNumber = new StringBuilder(String.valueOf(number))
                .reverse()
                .toString();

        return Integer.valueOf(reversedStringNumber) * sign;
    }

}
