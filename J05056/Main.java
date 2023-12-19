package J05056;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<VanDongVien> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new VanDongVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        list.sort(null);
        int n = list.size();
        int xepHang = 1;
        list.get(0).setXepHang(xepHang);
        for (int i = 1; i < n; ++i) {
            while (i < n && list.get(i).getFinalTime().equals(list.get(i - 1).getFinalTime())) {
                list.get(i).setXepHang(list.get(i - 1).getXepHang());
                ++i;
                ++xepHang;
            }

            if (i == n) {
                break;
            }

            list.get(i).setXepHang(++xepHang);
        }
        list.forEach(System.out::println);
    }
}
