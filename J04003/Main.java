package J04003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo phanSo = new PhanSo(scanner.nextLong(), scanner.nextLong());
        System.out.println(phanSo);
    }
}
