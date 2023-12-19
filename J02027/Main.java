package J02027;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);

            long count = 0;
            for (int i = 0; i < n; ++i) {
                int idx = lowerBound(arr, n, arr[i] + k);
                if (idx - i - 1 > 0) {
                    count += idx - i - 1;
                }
            }

            System.out.println(count);
        }
    }

    public static int lowerBound(int[] arr, int n, int val) {
        int l = -1;
        int r = n;

        while (l + 1 < r) {
            int mid = (r + l) / 2;
            if (arr[mid] >= val) {
                r = mid;
            } else {
                l = mid;
            }
        }

        return r;
    }
}
