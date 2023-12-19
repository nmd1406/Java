package J02008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();

            if(n < 3) {
                System.out.println(n);
            } else {
                System.out.println(solve(n, n - 1));
            }
        }
    }

    public static long gcd(long a, long b) {
        if(a == 0 || b == 0) {
            return a + b;
        }
        return gcd(b, a % b);
    }

    public static long solve(long a, long b) {
        if(b == 1) {
            return a;
        }

        a = (a * b) / gcd(a, b);
        --b;
        return solve(a, b);
    }
}
