package interviewpreparationkit.arrays;

import java.util.Scanner;

public class ArraysLeftRotation {

    private static final Scanner scanner = new Scanner(System.in, "UTF-8");

    // Complete the rotLeft function below.
    private static int[] rotLeft(int[] a, int d) {
        int[] retLeftArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            retLeftArr[(i + a.length - d) % a.length] = a[i];
        }
        return retLeftArr;
    }

    public static void main(String[] args) {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int aResult : result) {
            System.out.print(String.valueOf(aResult) + " ");
        }

        scanner.close();
    }

    //Solution 2
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[(i + n - d) % n] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }*/
}