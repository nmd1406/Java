package J02037;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            List<Integer> list = new ArrayList<>();
            String[] inp = scanner.nextLine().split("\\s+");
            for (String s : inp) {
                list.add(Integer.parseInt(s));
            }
            System.out.println(solve(list));
        }
    }

    public static String solve(List<Integer> list) {
        int countOdd = 0;
        int countEven = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                ++countEven;
            } else {
                ++countOdd;
            }
        }
        int size = list.size();
        if ((size % 2 == 0 && countEven > countOdd) || (size % 2 == 1 && countEven < countOdd)) {
            return "YES";
        }
        return "NO";
    }
}
