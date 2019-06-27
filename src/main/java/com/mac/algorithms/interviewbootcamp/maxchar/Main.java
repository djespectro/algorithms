package com.mac.algorithms.interviewbootcamp.maxchar;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String word = "abcccccccd";
        System.out.println(solution(word));
    }

    private static String solution(String word) {
        String[] array = word.split("");
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        String maxChar = "";
        for (String s : array) {
            int value = !map.containsKey(s) ? 1 : map.get(s) + 1;
            map.put(s, value);
            if(value > maxCount){
                maxChar = s;
                maxCount++;
            }
        }

        return maxChar;
    }


}
