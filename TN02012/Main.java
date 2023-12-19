package TN02012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> phongBanMap = new HashMap<>();
        while (n-- > 0) {
            String ma = scanner.next();
            String ten = scanner.nextLine().trim();
            phongBanMap.putIfAbsent(ma, ten);
        }

        n = Integer.parseInt(scanner.nextLine());
        List<NhanVien> nhanVienList = new ArrayList<>();
        while (n-- > 0) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            int luongCoBan = Integer.parseInt(scanner.nextLine());
            int ngayCong = Integer.parseInt(scanner.nextLine());
            char nhom = ma.charAt(0);
            int yearCount = Integer.parseInt(ma.substring(1, 3));
            String phongBan = phongBanMap.get(ma.substring(3));

            NhanVien nhanVien = new NhanVien(ma, ten, luongCoBan, ngayCong, phongBan);
            nhanVien.setLuongThang(nhom, yearCount);
            nhanVienList.add(nhanVien);
        }

        nhanVienList.forEach(System.out::println);
    }
}

/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
 */