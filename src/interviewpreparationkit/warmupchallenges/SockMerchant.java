package interviewpreparationkit.warmupchallenges;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
    private static int sockMerchant(int n, int[] ar) {
        HashMap inventory = new HashMap<Integer, Integer>();
        int matchingPairs = 0;
        for (int i = 0; i < n; i++) {
            int color = ar[i];
            if (inventory.containsKey(color) && inventory.get(color).equals(1)) {
                inventory.put(color, 0);
                matchingPairs++;
                continue;
            }
            inventory.put(color, 1);
        }
        return matchingPairs;
    }

    private static final Scanner scanner = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
