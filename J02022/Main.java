package J02022;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            n = scanner.nextInt();
            boolean[] arr = new boolean[n + 1];
            hoanVi("", arr);
        }
    }

    public static boolean check(String str) {
        for(int i = 1; i < str.length(); ++i) {
            if(Math.abs(str.charAt(i) - str.charAt(i - 1)) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void hoanVi(String str, boolean[] arr) {
        if(str.length() == n) {
            if(check(str)) {
                System.out.println(str);
            }
            return;
        }

        for(int i = 1; i <= n; ++i) {
            if(!arr[i]) {
                arr[i] = true;
                if(str.length() < n) {
                    hoanVi(str + i, arr);
                }
                arr[i] = false;
            }
        }
    }
}
