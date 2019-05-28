package hackerrank.warmup;

import java.util.Arrays;

public class SimpleArraySum {


    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 10, 11};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

    }

}
