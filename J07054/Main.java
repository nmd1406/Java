package J07054;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("BANGDIEM.in"));
        int test = Integer.parseInt(scanner.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new SinhVien(scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }
        list.sort(null);
        int xepHang = 1;
        int count = 1;
        for(int i = 0; i < list.size(); ++i) {
            if(i == 0 ) {
                System.out.println(list.get(i) + " " + xepHang);
            } else {
                if(list.get(i).getDiemTB() == list.get(i - 1).getDiemTB()) {
                    System.out.println(list.get(i) + " " + xepHang);
                    ++count;
                } else {
                    xepHang += count;
                    count = 1;
                    System.out.println(list.get(i) + " " + xepHang);
                }
            }

        }
    }
}
