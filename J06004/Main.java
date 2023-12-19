package J06004;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inp = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int m = Integer.parseInt(inp[1]);
        List<SinhVien> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }
        list.sort(null);
        List<String> stringList = new ArrayList<>();
        while (m-- > 0) {
            stringList.add(scanner.nextLine());
        }

        for (SinhVien sinhVien : list) {
            int nhom = sinhVien.getNhom();
            System.out.println(sinhVien + " " + stringList.get(nhom - 1));
        }
    }
}
