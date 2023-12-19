package J05058;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<ThiSinh> thiSinhList = new ArrayList<>();
        while (test-- > 0) {
            thiSinhList.add(new ThiSinh(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }
        thiSinhList.sort(null);
        thiSinhList.forEach(System.out::println);
    }
}

/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
 */