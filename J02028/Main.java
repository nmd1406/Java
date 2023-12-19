package J02028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(solve(arr, n, k));
        }
    }

    public static String  solve(int[] arr, int n, long k) {
        long currSum = 0;
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            currSum += arr[i];
            if (currSum == k) {
                return "YES";
            }
            if (map.containsKey(currSum - k)) {
                return "YES";
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return "NO";
    }
}
