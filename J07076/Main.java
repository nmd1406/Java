package J07076;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MATRIX.in"));
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int col = scanner.nextInt() - 1;
            int[][] arr = new int[n][m];
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < m; ++j) {
                    arr[i][j] = scanner.nextInt();
                }
            }

            for(int i = 0; i < n - 1; ++i) {
                for(int j = i + 1; j < n; ++j) {
                    if (arr[i][col] > arr[j][col]) {
                        int temp = arr[i][col];
                        arr[i][col] = arr[j][col];
                        arr[j][col] = temp;
                    }
                }
            }

            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < m; ++j) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
