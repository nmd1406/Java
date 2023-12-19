package J04002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        String color = scanner.next().toLowerCase();
        color = String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);
        Rectangle rectangle = new Rectangle(width, height, color);

        if(width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {
            System.out.printf("%.0f %.0f %s", rectangle.findPerimeter(), rectangle.findArea(), rectangle.getColor());
        }
    }
}
