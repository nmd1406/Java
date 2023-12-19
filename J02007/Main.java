package J02007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        for(int i = 1; i <= test; ++i) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int[] map = new int[100003];

            for(int j = 0; j < n; ++j) {
                arr[j] = scanner.nextInt();
                ++map[arr[j]];
            }
            System.out.printf("Test %d:\n", i);
            for(int j = 0; j < n; ++j) {
                if(map[arr[j]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", arr[j], map[arr[j]]);
                }
                map[arr[j]] = 0;
            }

        }
    }
}
