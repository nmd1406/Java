package J04004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhanSo p1 = new PhanSo(scanner.nextLong(), scanner.nextLong());
        PhanSo p2 = new PhanSo(scanner.nextLong(), scanner.nextLong());
        p1.add(p2);
        System.out.print(p1);
    }
}
