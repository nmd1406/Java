package J01021;

import java.util.Scanner;

public class Main {
    final static int mod = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a;
        long b;
        while (true) {
            a = scanner.nextLong();
            b = scanner.nextLong();

            if(a == 0 && b == 0) {
                break;
            }
            System.out.println(pow(a, b));
        }
    }

    public static long pow(long a, long b) {
        if(b == 0) {
            return 1;
        }
        long temp = pow(a, b / 2) % mod;
        if(b % 2 == 0) {
            return (temp * temp) % mod;
        }
        return a * (temp * temp % mod) % mod;
    }
}
