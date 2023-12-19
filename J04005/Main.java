package J04005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()));
        System.out.println(sinhVien);
    }
}

class SinhVien {
    private String ten;
    private String dob;
    private double diem1;
    private double diem2;
    private double diem3;

    public SinhVien(String ten, String dob, double diem1, double diem2, double diem3) {
        this.ten = ten;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    private double tongDiem() {
        return diem1 + diem2 + diem3;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f", ten, dob, tongDiem());
    }
}
