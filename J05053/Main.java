package J05053;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<QuanAo> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new QuanAo(scanner.nextLine(), scanner.nextLine(), Long.parseLong(scanner.nextLine()), Long.parseLong(scanner.nextLine())));
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
