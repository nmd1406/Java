package J05069;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<FC> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new FC(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }

        test = Integer.parseInt(scanner.nextLine());
        List<Match> matchList = new ArrayList<>();
        while (test-- > 0) {
            String[] inp = scanner.nextLine().split(" ");
//            System.out.println(Arrays.toString(inp));
            FC fc = list.get(list.indexOf(new FC(inp[0].substring(1, 3))));
            matchList.add(new Match(fc, inp[0], Integer.parseInt(inp[1])));
        }

        matchList.forEach(System.out::println);
    }
}

/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
 */