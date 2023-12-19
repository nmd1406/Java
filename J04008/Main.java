package J04008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point p3 = new Point(scanner.nextDouble(), scanner.nextDouble());

            double ab = Point.distance(p1, p2);
            double bc = Point.distance(p2, p3);
            double ac = Point.distance(p1, p3);
            if(ab + bc > ac && ab + ac > bc && ac + bc > ab) {
                System.out.printf("%.3f\n", ab + bc + ac);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
