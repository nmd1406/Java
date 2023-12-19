package J07019;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, QuanAo> quanAoMap = new HashMap<>();
        while (n-- > 0) {
            String ma = scanner.nextLine();
            quanAoMap.putIfAbsent(ma, new QuanAo(ma, scanner.nextLine(),Long.parseLong(scanner.nextLine()), Long.parseLong(scanner.nextLine())));
        }

        scanner = new Scanner(new File("DATA2.in"));
        n = Integer.parseInt(scanner.nextLine());
        List<HoaDon> hoaDonList = new ArrayList<>();
        while (n-- > 0) {
            String ma = scanner.next();
            int soLuong = Integer.parseInt(scanner.nextLine().trim());
            hoaDonList.add(new HoaDon(ma, soLuong, quanAoMap.get(ma.substring(0, 2))));
        }

        hoaDonList.forEach(System.out::println);
    }
}
