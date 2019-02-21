package interviewpreparationkit.warmupchallenges;

import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    private static int countingValleys(int n, String s) {
        int numberOfValleys = 0;
        int currentLevel = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U') currentLevel++;
            if (c == 'D') currentLevel--;

            // if we just came UP to sea level
            if (currentLevel == 0 && c == 'U')
                ++numberOfValleys;
        }
        return numberOfValleys;
    }

    private static final Scanner scanner = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        scanner.close();
    }
}
