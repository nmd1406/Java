package J07048;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("SANPHAM.in"));
        int test = Integer.parseInt(scanner.nextLine());
        List<SanPham> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new SanPham(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
        }
        list.sort(null);
        list.forEach(System.out::println);
    }
}
