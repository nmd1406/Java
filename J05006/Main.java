package J05006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<NhanVien> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new NhanVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        list.forEach(System.out::println);
    }
}
