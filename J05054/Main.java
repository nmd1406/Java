package J05054;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<HocSinh> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new HocSinh(scanner.nextLine(), Double.parseDouble(scanner.nextLine())));
        }

        List<HocSinh> sortedList = new ArrayList<>(list);
        sortedList.sort(null);
        int xepHang = 1;
        sortedList.get(0).setXepHang(xepHang);
        for (int i = 1; i < sortedList.size(); ++i) {
            while (i < sortedList.size() && sortedList.get(i).getDiemTB() == sortedList.get(i - 1).getDiemTB()) {
                sortedList.get(i).setXepHang(sortedList.get(i - 1).getXepHang());
                ++i;
                ++xepHang;
            }
            if (i == sortedList.size()) {
                break;
            }   
            sortedList.get(i).setXepHang(++xepHang);
        }
//        sortedList.get(sortedList.size() - 1).setXepHang(xepHang);
        list.forEach(System.out::println);
    }
}

/*
3
Tran Minh Hieu
5.9
Nguyen Bao Trung
8.6
Le Hong Ha
9.2
 */