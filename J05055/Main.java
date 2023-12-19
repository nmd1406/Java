package J05055;

import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
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

        List<VanDongVien> sortedList = new ArrayList<>(list);
        sortedList.sort(null);
        int n = sortedList.size();
        int xepHang = 1;
        sortedList.get(0).setXepHang(xepHang);
        for (int i = 1; i < n; ++i) {
            while (i < n && sortedList.get(i).getFinalTime().equals(sortedList.get(i - 1).getFinalTime())) {
                sortedList.get(i).setXepHang(sortedList.get(i - 1).getXepHang());
                ++i;
                ++xepHang;
            }

            if (i == n) {
                break;
            }

            sortedList.get(i).setXepHang(++xepHang);
        }

        list.forEach(System.out::println);
    }
}

/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
 */