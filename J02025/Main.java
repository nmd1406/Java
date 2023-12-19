package J02025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int n;
    private static List<Integer> list = new ArrayList<>();
    private static int[] arr = new int[20];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            n = scanner.nextInt();
            for (int i = 0; i < n; ++i) {
                list.add(scanner.nextInt());
            }

            list.sort(Comparator.reverseOrder());
            backTrack(0);
            list.clear();
        }
    }

    public static void backTrack(int i) {
        for (int j = 0; j <= 1; ++j) {
            arr[i] = j;
            if (i == n - 1) {
                int sum = 0;
                for (int k = 0; k < n; ++k) {
                    sum += list.get(k) * arr[k];
                }

                if (isPrime(sum)) {
                    for (int k = 0; k < n; ++k) {
                        if (arr[k] == 1) {
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

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
