package J02006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n + m];
        int[] map = new int[1003];

        for(int i = 0; i < n + m; ++i) {
            a[i] = scanner.nextInt();
            map[a[i]] = 1;
        }
        for(int i = 0; i <= 1000; ++i) {
            if(map[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
