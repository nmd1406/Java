package J02024;

import java.util.*;

public class Main {
    private static int n;
    private static List<Integer> list;
    private static int[] b = new int[20];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            n = scanner.nextInt();
            list = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                list.add(scanner.nextInt());
            }
            list.sort(Comparator.reverseOrder());
            backTrack(0);
        }
    }

    public static void backTrack(int i) {
        for (int j = 0; j <= 1; ++j) {
            b[i] = j;

            if (i == n - 1) {
                int sum = 0;
                for (int k = 0; k < n; ++k) {
                    if (b[k] == 1) {
                        sum += list.get(k);
                    }
                }

                if (sum % 2 == 1) {
                    for (int k = 0; k < n; ++k) {
                        if (b[k] == 1) {
                            System.out.print(list.get(k) + " ");
                        }
                    }
                    System.out.println();
                }
            } else {
                backTrack(i + 1);
            }
        }
    }
}
