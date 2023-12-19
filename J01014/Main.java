package J01014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            long n = scanner.nextLong();
            System.out.println(primeDivisor(n));
        }
    }

    public static long primeDivisor(long n) {
        long largestPrime = -1;
        for(int i = 2; i <= Math.sqrt(n); ++i) {
            if(n % i == 0) {
                largestPrime = Math.max(largestPrime, i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        if(n > 1) {
            largestPrime = Math.max(largestPrime, n);
        }
        return largestPrime;
    }
}
