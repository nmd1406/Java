package J02036;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n + 1];
            for (int i = 0; i < n; ++i) {
                a[i] = scanner.nextInt();
            }
            b[0] = a[0];
            b[n] = a[n - 1];
            for (int i = 1; i < n; ++i) {
                b[i] = a[i - 1] * a[i] / gcd(a[i - 1], a[i]);
            }
            for (int num : b) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        return gcd(b, a % b);
    }
}
