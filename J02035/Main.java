package J02035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            List<Long> list = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                list.add(scanner.nextLong());
            }

            long min = Collections.min(list);
            System.out.println(list.indexOf(min));
        }
    }
}
