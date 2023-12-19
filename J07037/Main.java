package J07037;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DN.in"));
        int test = Integer.parseInt(scanner.nextLine());
        List<DoanhNghiep> doanhNghiepList = new ArrayList<>();
        while (test-- > 0) {
            doanhNghiepList.add(new DoanhNghiep(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }

        doanhNghiepList.sort(null);
        doanhNghiepList.forEach(System.out::println);
    }
}
