package J06007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<MonHoc> monHocList = new ArrayList<>();
        while (n-- > 0) {
            monHocList.add(new MonHoc(scanner.next(), scanner.nextLine()));
        }

        n = Integer.parseInt(scanner.nextLine());
        List<GiangVien> giangVienList = new ArrayList<>();
        while (n-- > 0) {
            giangVienList.add(new GiangVien(scanner.next(), scanner.nextLine()));
        }

        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String maGV = scanner.next();
            String maMon = scanner.next();
            double time = Double.parseDouble(scanner.nextLine());

            giangVienList.forEach(giangVien -> {
                if (maGV.equals(giangVien.getMa())) {
                    giangVien.setTime(time);
                }
            });
        }

        giangVienList.forEach(System.out::println);
    }
}

/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
 */