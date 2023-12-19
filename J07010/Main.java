package J07010;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("SV.in"));
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
            System.out.println(sinhVien);
        }
        scanner.close();
    }
}
