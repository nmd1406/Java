package J01011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long ucln = gcd(a, b);
            long bcnn = a * b / ucln;

            System.out.println(bcnn + " " + ucln);
        }
    }

    public static long gcd(long a, long b) {
        if(a == 0 || b == 0) {
            return a + b;
        }

        return gcd(b, a % b);
    }
}
