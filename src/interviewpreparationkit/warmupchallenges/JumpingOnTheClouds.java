package interviewpreparationkit.warmupchallenges;

import java.util.Scanner;

public class JumpingOnTheClouds {

    private static final Scanner scanner = new Scanner(System.in, "UTF-8~");

    // Complete the jumpingOnClouds function below.
    private static int jumpingOnClouds(int[] c) {
        int totalStep = -1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) {
                totalStep++;
                if ((i + 2 < c.length && c[i + 2] == 0)) {
                    i++;
                }
            }
        }
        return totalStep;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
