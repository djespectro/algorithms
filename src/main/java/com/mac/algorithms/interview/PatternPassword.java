package com.mac.algorithms.interview;

public class PatternPassword {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 3, 2, 1, 4};

        boolean result = solution(array);
        System.out.println("result: " + result);
    }

    private static boolean solution(int[] position) {

        int previewValue = position[0];
        int ROW = 3;
        int COLUMN = 1;

        for (int i = 1; i < position.length; i++) {

            if (position[i] != previewValue + COLUMN
                    && position[i] != previewValue - COLUMN
                    && position[i] != previewValue + ROW
                    && position[i] != previewValue - ROW) {

                return false;
            }

            if ((position[i] == 3 && previewValue == 4)
                    || (position[i] == 4 && previewValue == 3)
                    || position[i] == 6 && previewValue == 7
                    || position[i] == 7 && previewValue == 6) {

                return false;
            }

            previewValue = position[i];
        }

        return true;
    }

}
