package interviewpreparationkit.arrays;

import java.util.Scanner;

public class ArrayManipulation {

    private static final Scanner scanner = new Scanner(System.in, "UTF-8");

    // Complete the arrayManipulation function below.
    private static long arrayManipulation(int n, int[][] queries) {
        //is just storing how much one element is bigger than the previous element

        long[] computation = new long[n];

        for (int[] query : queries) {
            int a = query[0] - 1;
            int b = query[1] - 1;
            int k = query[2];

            computation[a] += k;
            if (b + 1 < n) {
                computation[b + 1] -= k;
            }
        }

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += computation[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
