package J05003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= test; ++i) {
            SinhVien sinhVien = new SinhVien(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
            System.out.println(sinhVien);
        }
    }
}
