package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<MatHang> list = new ArrayList<>();
        for(int i = 1; i <= test; ++i) {
            list.add(new MatHang(i, scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
        }

        Collections.sort(list, (o1, o2) -> {
            if(o1.loiNhuan() != o2.loiNhuan()) {
                return o2.loiNhuan() - o1.loiNhuan();
            }
            return o1.getMa().compareTo(o2.getMa());
        });
        for(MatHang matHang : list) {
            System.out.println(matHang);
        }
    }
}
