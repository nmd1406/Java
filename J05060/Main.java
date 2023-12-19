package J05060;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<ThiSinh> thiSinhList = new ArrayList<>();
        while (test-- > 0) {
            thiSinhList.add(new ThiSinh(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }

        thiSinhList.forEach(System.out::println);
    }
}

/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
 */