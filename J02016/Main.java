package J02016;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; ++i) {
                arr[i] = scanner.nextLong();
                arr[i] *= arr[i];
            }

            Arrays.sort(arr);
            boolean flag = false;
            for(int i = n - 1; i >= 2; --i) {
                int l = 0;
                int r = i - 1;
                while (l < r) {
                    if(arr[l] + arr[r] == arr[i]) {
                        flag = true;
                        break;
                    } else if(arr[l] + arr[r] < arr[i]) {
                        ++l;
                    } else {
                        --r;
                    }
                }
            }
            if(flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
