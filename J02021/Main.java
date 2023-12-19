package J02021;

import java.util.Scanner;

public class Main {
    static int n;
    static int k;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        k = scanner.nextInt();
        toHop(1, "");
        System.out.println();
        System.out.print("Tong cong co " + count + " to hop");
    }

    public static void toHop(int i, String str) {
        if(str.length() == k) {
            System.out.print(str + " ");
            ++count;
            return;
        }
        for(int j = i; j <= n; ++j) {
            toHop(j + 1, str + j);
        }
    }
}
