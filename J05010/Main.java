package J05010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<MatHang> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new MatHang(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }
        list.sort(null);
        list.forEach(System.out::println);
    }
}
