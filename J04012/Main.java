package J04012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), scanner.next());
        System.out.println(nhanVien);
    }
}
