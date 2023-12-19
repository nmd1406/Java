package J01005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {
            double n = scanner.nextDouble();
            double h = scanner.nextDouble();

            for(int i = 1; i < n; ++i) {
                System.out.printf("%.6f ", Math.sqrt(i / n) * h);
            }

            System.out.println();
        }
    }
}
