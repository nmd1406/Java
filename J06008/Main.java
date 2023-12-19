package J06008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, MonHoc> monHocList = new HashMap<>();
        while (n-- > 0) {
            String ma = scanner.next();
            String ten = scanner.nextLine();
            monHocList.put(ma, new MonHoc(ma, ten));
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

            MonHoc monHoc = new MonHoc(monHocList.get(maMon).getMa(), monHocList.get(maMon).getTen());
            GiangVien giangVien = giangVienList.get(giangVienList.indexOf(new GiangVien(maGV)));
            giangVien.addMonHoc(monHoc);
            for (MonHoc mon : giangVien.getMonHocList()) {
                if (mon.getMa().equals(maMon)) {
                    mon.addTime(time);
                }
            }
            giangVien.addTime(time);
        }
        String query = scanner.nextLine();
        GiangVien giangVien = giangVienList.get(giangVienList.indexOf(new GiangVien(query)));
        System.out.println("Giang vien: " + giangVien.getTen());
        System.out.println(giangVien);
    }

//        monHocList.forEach(monHoc -> System.out.println(monHoc.getTime()));
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
GV01

2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV01 INT1306 126.72
GV01

3
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
INT1234 OOP
3
GV01 Nguyen Van An
GV02 Hoang Binh Minh
GV03 balls cock
4
GV01 INT1155 113.2
GV01 INT1306 126.72
GV02 INT1155 50
GV01 INT1234 40
GV01
 */