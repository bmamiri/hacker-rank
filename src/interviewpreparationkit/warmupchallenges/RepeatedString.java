package interviewpreparationkit.warmupchallenges;

import java.util.Scanner;

public class RepeatedString {

    private static final Scanner scanner = new Scanner(System.in, "UTF-8");

    // Complete the repeatedString function below.
    private static long repeatedString(String s, long n) {
        long countForSubstring = 0;
        long totalCount = 0;

        //Determines how many a's are in a substring
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countForSubstring++;
            }
        }

        //Determines how many complete substrings we will analyze
        long divisor = n / s.length();

        totalCount += divisor * countForSubstring;


        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % s.length();

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                totalCount++;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
