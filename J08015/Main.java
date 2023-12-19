package J08015;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; ++i) {
                arr[i] = scanner.nextLong();
            }

            long count = 0;
            Map<Long, Long> map = new HashMap<>();
            for(int i = 0; i < n; ++i) {
                if(map.containsKey(k - arr[i])) {
                    count += map.get(k - arr[i]);
                }
                if(map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1L);
                }
            }
            System.out.println(count);
        }
    }
}
