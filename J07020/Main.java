package J07020;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, KhachHang> khachHangMap = new HashMap<>();
        while (n-- > 0) {
            KhachHang khachHang = new KhachHang(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            khachHangMap.putIfAbsent(khachHang.getMa(), khachHang);
        }

        scanner = new Scanner(new File("MH.in"));
        n = Integer.parseInt(scanner.nextLine());
        Map<String, MatHang> matHangMap = new HashMap<>();
        while (n-- > 0) {
            MatHang matHang = new MatHang(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
            matHangMap.putIfAbsent(matHang.getMa(), matHang);
        }

        scanner = new Scanner(new File("HD.in"));
        n = Integer.parseInt(scanner.nextLine());
        List<HoaDon> hoaDonList = new ArrayList<>();
        while (n-- > 0) {
            String[] inp = scanner.nextLine().split(" ");
            KhachHang khachHang = khachHangMap.get(inp[0]);
            MatHang matHang = matHangMap.get(inp[1]);
            hoaDonList.add(new HoaDon(khachHang, matHang, Integer.parseInt(inp[2])));
        }

        hoaDonList.forEach(System.out::println);
    }
}
