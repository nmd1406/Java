package J05029;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<DoanhNghiep> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new DoanhNghiep(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }
        list.sort(null);
        int q = Integer.parseInt(scanner.nextLine());
        while (q-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            list.forEach(doanhNghiep -> {
                if (doanhNghiep.getSoSV() >= a && doanhNghiep.getSoSV() <= b) {
                    System.out.println(doanhNghiep);
                }
            });
        }
    }
}
