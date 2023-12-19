package J01008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        int j = 1;
        while (test-- > 0) {
            int n = scanner.nextInt();

            System.out.print("Test " + j + ": ");
            for (int i = 2; i <= Math.sqrt(n); ++i) {
                if(n % i == 0) {
                    int count = 0;
                    while (n % i == 0) {
                        ++count;
                        n /= i;
                    }

                    System.out.printf("%d(%d) ", i, count);
                }
            }

            if(n > 1) {
                System.out.printf("%d(1)", n);
            }
            ++j;
            System.out.println();
        }
    }
}
