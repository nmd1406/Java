package J01022;

import java.util.Scanner;

public class Main {
    static long[] x = new long[93];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        x[0] = 0;
        x[1] = 1;
        for(int i = 2; i <= 92; ++i) {
            x[i] = x[i - 1] + x[i - 2];
        }
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();

            System.out.println(solve(n, k));
        }
    }

    public static char solve(int n, long k) {
        if(n == 1) {
            return '0';
        }
        if(n == 2) {
            return '1';
        }

        if(k <= x[n - 2]) {
            return solve(n - 2, k);
        }
        return solve(n - 1, k - x[n - 2]);
    }
}
