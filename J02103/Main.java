package J02103;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        for(int idx = 1; idx <= test; ++idx){
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[][] arr = new int[n][m];
            int[][] revArr = new int[m][n];
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < m; ++j) {
                    arr[i][j] = scanner.nextInt();
                    revArr[j][i] = arr[i][j];
                }
            }


            int[][] res = new int[n][n];
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < n; ++j) {
                    for(int k = 0; k < m; ++k) {
                        res[i][j] += arr[i][k] * revArr[k][j];
                    }
                }
            }

            System.out.printf("Test %d:\n", idx);
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < n; ++j) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
