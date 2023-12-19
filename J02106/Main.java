package J02106;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][3];

        int res = 0;
        for(int i = 0; i < n; ++i) {
            int count = 0;
            for(int j = 0; j < 3; ++j) {
                arr[i][j] = scanner.nextInt();
                if(arr[i][j] == 1) {
                    ++count;
                }
            }
            if(count > 1) {
                ++res;
            }
        }

        System.out.println(res);
    }
}
