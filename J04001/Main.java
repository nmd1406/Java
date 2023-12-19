package J04001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
            System.out.printf("%.4f\n", Point.distance(p1, p2));
        }
    }
}
