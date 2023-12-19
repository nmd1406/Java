package J02005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        int[] map1 = new int[1002];
        int[] map2 = new int[1002];

        for(int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
            map1[a[i]] = 1;
        }
        for(int i = 0; i < m; ++i) {
            b[i] = scanner.nextInt();
            map2[b[i]] = 1;
        }

        for(int i = 0; i <= 1000; ++i) {
            if(map1[i] == 1 && map2[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
