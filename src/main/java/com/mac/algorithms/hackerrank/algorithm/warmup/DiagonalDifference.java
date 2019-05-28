package hackerrank.warmup;

public class DiagonalDifference {

    public static void main(String[] args) {

        int[][] arr = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        int size = arr.length;

        int a = 0;
        int b = 0;

        for(int i = 0; i< size; i++){
            a += arr[i][i];
            b += arr[i][size-1-i];
        }

        int total = Math.abs(a-b);

        System.out.println("a: " + a);
        System.out.println("b: " + b);


        System.out.println("total: " + total);

    }


}
