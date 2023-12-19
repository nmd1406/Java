package J01012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {
            long n = scanner.nextLong();

            double sq = Math.sqrt(n);
            int count = 0;
            for(int i = 1; i <= sq; ++i) {
                if(n % i == 0) {
                    if(i % 2 == 0) {
                        ++count;
                    }
                    if((n / i != i) && ((n / i) % 2 == 0)) {
                        ++count;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
