package J05005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i = 1; i <= test; ++i) {
            SinhVien sinhVien = new SinhVien(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
            arr.add(sinhVien);
        }
        Collections.sort(arr, (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa()) < 0 ? 1 : -1);

        for(SinhVien sinhVien : arr) {
            System.out.println(sinhVien);
        }
    }

}
