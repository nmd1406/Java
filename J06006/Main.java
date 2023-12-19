package J06006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<KhachHang> khachHangList = new ArrayList<>();
        while (n-- > 0) {
            khachHangList.add(new KhachHang(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        int m = Integer.parseInt(scanner.nextLine());
        List<MatHang> matHangList = new ArrayList<>();
        while (m-- > 0) {
            matHangList.add(new MatHang(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
        }

        int k = Integer.parseInt(scanner.nextLine());
        List<HoaDon> hoaDonList = new ArrayList<>();
        while (k-- > 0) {
            hoaDonList.add(new HoaDon(scanner.next(), scanner.next(), scanner.nextInt(), khachHangList, matHangList));
        }
        hoaDonList.sort(null);
        hoaDonList.forEach(System.out::println);
    }
}

/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
 */