package J07034;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<MonHoc> list = new ArrayList<>();
        while (test-- > 0) {
            MonHoc monHoc = new MonHoc(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
            list.add(monHoc);
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
