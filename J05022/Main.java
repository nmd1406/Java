package J05022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        int q = Integer.parseInt(scanner.nextLine());
        while (q-- > 0) {
            String lop = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            list.forEach(sinhVien -> {
                if (sinhVien.getLop().equals(lop)) {
                    System.out.println(sinhVien);
                }
            });
        }
    }
}
