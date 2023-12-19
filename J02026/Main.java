package J02026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int n;
    private static int k;
    private static int[] a = new int[20];
    private static int[] b = new int[20];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            for (int i = 1; i <= n; ++i) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a, 1, n + 1);
            backTrack(1);
        }
    }

    public static void backTrack(int i) {
        for (int j = b[i - 1] + 1; j <= n; ++j) {
            b[i] = j;
            if (i == k) {
                for (int h = 1; h <= k; ++h) {
                    System.out.print(a[b[h]] + " ");
                }
                System.out.println();
            } else {
                backTrack(i + 1);
            }
        }
    }
}
