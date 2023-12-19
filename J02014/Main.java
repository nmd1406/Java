package J02014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int[] sum = new int[n];

            arr[0] = scanner.nextInt();
            sum[0] = arr[0];

            for(int i = 1; i < n; ++i) {
                arr[i] = scanner.nextInt();
                sum[i] = sum[i - 1] + arr[i];
            }

            int pos = -1;
            for(int i = 0; i < n; ++i) {
                if(sum[i] - arr[i] == sum[n - 1] - sum[i]) {
                    pos = i + 1;
                    break;
                }
            }

            System.out.println(pos);
        }
    }
}
