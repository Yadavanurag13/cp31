import java.util.*;
import java.lang.*;
import java.io.*;

public class demo {
    public static int function(int[] arr, int x) {

        int maxdiff = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];

            maxdiff = Math.max(maxdiff, diff);
        }

        int last = 2 * (x - arr[arr.length - 1]);

        maxdiff = Math.max(maxdiff, last);
        return maxdiff;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(function(arr, x));
        }
        sc.close();
    }
}
