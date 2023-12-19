package J07073;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int test = Integer.parseInt(scanner.nextLine());
        List<MonHoc> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new MonHoc(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine()));
        }
        list.sort(null);
        list.forEach(monHoc -> {
            if (monHoc.filter(monHoc.getHinhThucThucHanh())) {
                System.out.println(monHoc);
            }
        });
    }
}
