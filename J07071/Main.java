package J07071;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        int test = Integer.parseInt(scanner.nextLine());
        List<Ten> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new Ten(scanner.nextLine()));
        }
        list.sort(null);

        int n = Integer.parseInt(scanner.nextLine());
        String str = "";
        while (n-- > 0) {
            str = scanner.nextLine();
            for (Ten ten : list) {
                if (ten.compare(str)) {
                    System.out.println(ten);
                }
            }
        }
    }
}
