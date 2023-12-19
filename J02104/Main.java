package J02104;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(arr[i][j] == 1) {
                    arr[j][i] = 0;
                    System.out.printf("(%d,%d)\n", i + 1, j + 1);
                }
            }
        }
    }
}
