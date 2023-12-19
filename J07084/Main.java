package J07084;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner= new Scanner(new File("ONLINE.in"));
        int test = Integer.parseInt(scanner.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        list.sort(null);
        list.forEach(System.out::println);
    }
}
