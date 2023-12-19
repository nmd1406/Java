package J02023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();

        if (n * 9 < s || s == 0) {
            System.out.println("-1 -1");
        } else {
            System.out.println(min(n, s) + " " + max(n, s));
        }
    }

    public static String max(int n, int s) {
        StringBuilder builder = new StringBuilder();
        while (s > 9) {
            builder.append("9");
            s -= 9;
        }

        if (s > 0) {
            builder.append(s);
            while (builder.length() < n) {
                builder.append("0");
            }
        }

        return builder.toString();
    }

    public static String min(int n, int s) {
        StringBuilder string = new StringBuilder();

        while (s > 9) {
            string.append("9");
            s -= 9;
        }

        if (s > 0) {
            if (string.length() == n - 1) {
                string.insert(0, s);
            } else {
                string.insert(0, (s - 1));
                while (string.length() < n - 1) {
                    string.insert(0, "0");
                }
                string.insert(0, "1");
            }
        }
        return string.toString();
    }
}
