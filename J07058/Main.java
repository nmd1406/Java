package J07058;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));

        int test = Integer.parseInt(scanner.nextLine());
        Set<MonHoc> set = new TreeSet<>();
        while (test-- > 0) {
            MonHoc monHoc = new MonHoc(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            set.add(monHoc);
        }

        set.forEach(System.out::println);
    }
}
