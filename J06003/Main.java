package J06003;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inp = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int m = Integer.parseInt(inp[1]);
        List<SinhVien> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }
        List<String> stringList = new ArrayList<>();
        while (m-- > 0) {
            stringList.add(scanner.nextLine());
        }

        int q = Integer.parseInt(scanner.nextLine());
        while (q-- > 0) {
            int nhom = Integer.parseInt(scanner.nextLine());
            System.out.println("DANH SACH NHOM " + nhom + ":");
            list.forEach(sinhVien -> {
                if (sinhVien.getNhom() == nhom) {
                    System.out.println(sinhVien);
                }
            });
            System.out.println("Bai tap dang ky: " + stringList.get(nhom - 1));
        }
    }
}
