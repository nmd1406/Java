package J03008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            String str = scanner.next();

            if(check(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(String str) {
        int s = 0;
        int e = str.length() - 1;

        while (s < e) {
            if(str.charAt(s) != str.charAt(e)) {
                return false;
            }
            ++s;
            --e;
        }

        for(int i = 0; i < str.length(); ++i) {
            if(!isPrime(str.charAt(i) - '0')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
