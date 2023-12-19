package J04006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinhVien sv = new SinhVien(scanner.nextLine(), scanner.next(), scanner.next(), scanner.nextFloat());
        System.out.println(sv);
    }
}
