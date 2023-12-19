package J07033;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (test-- > 0) {
            SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            list.add(sinhVien);
        }

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
