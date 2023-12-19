package J01003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if(a == 0 && b != 0) {
            System.out.println("VN");
        } else if (b == 0) {
            System.out.println("VSN");
        } else {
            System.out.printf("%.2f", (-b / a));
        }
    }
}
