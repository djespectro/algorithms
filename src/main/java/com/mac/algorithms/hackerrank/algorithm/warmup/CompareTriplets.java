package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);

        List<Integer> result = Arrays.asList(0, 0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) result.set(0, result.get(0) + 1);
            if (a.get(i) < b.get(i)) result.set(1, result.get(1) + 1);
        }

        System.out.println(result.get(0));
        System.out.println(result.get(1));

    }

}
