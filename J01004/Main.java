package J01004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {
            int n = scanner.nextInt();

            if(isPrime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); ++i) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
