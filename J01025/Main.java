package J01025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        int maxX = Math.max(x1, Math.max(x2, Math.max(x3, x4)));
        int minX = Math.min(x1, Math.min(x2, Math.min(x3, x4)));
        int maxY = Math.max(y1, Math.max(y2, Math.max(y3, y4)));
        int minY = Math.min(y1, Math.min(y2, Math.min(y3, y4)));

        int d = Math.max(maxX - minX, maxY - minY);
        System.out.println(d * d);
    }
}
