package J01002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {
            long n = scanner.nextLong();
            System.out.println((n + 1) * n / 2);
        }
    }
}
