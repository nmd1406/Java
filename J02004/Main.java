package J02004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(solve(arr, n));
        }
    }

    public static String solve(int[] arr, int n) {
        for(int i = 0; i < n / 2; ++i) {
            if(arr[i] != arr[n - i - 1]) {
                return "NO";
            }
        }

        return "YES";
    }
}
