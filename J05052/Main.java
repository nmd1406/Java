package J05052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            QuanAo quanAo = new QuanAo(scanner.nextLine(), scanner.nextLine(), Long.parseLong(scanner.nextLine()), Long.parseLong(scanner.nextLine()));
            System.out.println(quanAo);
        }
    }
}
