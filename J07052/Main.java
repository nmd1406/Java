package J07052;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        int test = Integer.parseInt(scanner.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i = 0; i < test; ++i) {
            list.add(new ThiSinh(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }

        int chiTieu = Integer.parseInt(scanner.nextLine());
        chiTieu = Math.min(chiTieu, test);
        list.sort(null);
        double diemChuan = list.get(chiTieu - 1).getDiem();
        System.out.printf("%.1f\n", diemChuan);
        list.forEach(thiSinh -> {
            thiSinh.setTrangThai(diemChuan);
            System.out.println(thiSinh);
        });
    }
}
