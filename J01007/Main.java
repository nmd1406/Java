package J01007;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {
            long n = scanner.nextLong();

            if(fibo(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean fibo(long n) {
        long[] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;

        for (int i = 2; i <= 92; ++i)  {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return Arrays.binarySearch(fibo, n) >= 0;
    }
}
