package J08012;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            list.get(u - 1).add(v);
            list.get(v - 1).add(u);
        }

        for (int i = 0; i < n; ++i) {
            if (list.get(i).size() == n - 1) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
