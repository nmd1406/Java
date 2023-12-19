package J01009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long sum = 0;
        long a = 1;

        for(int i = 1; i <= n; ++i) {
            a *= i;
            sum += a;
        }

        System.out.print(sum);
    }
}
