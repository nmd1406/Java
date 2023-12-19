package J05027;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<GiangVien> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new GiangVien(scanner.nextLine(), scanner.nextLine()));
        }
        int q = Integer.parseInt(scanner.nextLine());
        while (q-- > 0) {
            String tuKhoa = scanner.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tuKhoa + ":");
            list.forEach(giangVien -> {
                if (giangVien.getTen().toLowerCase().contains(tuKhoa.toLowerCase())) {
                    System.out.println(giangVien);
                }
            });
        }
    }
}

/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
 */