package J05023;

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
            String nam = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + nam + ":");
            list.forEach(sinhVien -> {
                if (sinhVien.getNam().equals(nam)) {
                    System.out.println(sinhVien);
                }
            });
        }
    }
}

