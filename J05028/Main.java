package J05028;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<DoanhNghiep> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new DoanhNghiep(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }
        list.sort(null);
        list.forEach(System.out::println);
    }
}
