package J05024;

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
            String nganh = scanner.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
            list.forEach(sinhVien -> {
                if (nganh.equals("CONG NGHE THONG TIN") || nganh.equals("AN TOAN THONG TIN")) {
                    if (!sinhVien.getLop().startsWith("E") && sinhVien.getNganh().equals(nganh)) {
                        System.out.println(sinhVien);
                    }
                } else {
                    if (sinhVien.getNganh().equals(nganh)) {
                        System.out.println(sinhVien);
                    }
                }
            });
        }
    }
}

/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
Ke toan
 */