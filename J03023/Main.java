package J03023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            String str = scanner.next();
            int res = 0;
            for (int i = 0; i < str.length(); ++i) {
                int num1 = getValue(str.charAt(i));

                if (i + 1 < str.length()) {
                    int num2 = getValue(str.charAt(i + 1));
                    if (num1 >= num2) {
                        res += num1;
                    } else {
                        res += (num2 - num1);
                        ++i;
                    }
                } else {
                    res += num1;
                }
            }
            System.out.println(res);
        }
    }

    public static int getValue(char ch) {
        if (ch == 'I') {
            return 1;
        }
        if(ch == 'V') {
            return 5;
        }
        if (ch == 'X') {
            return 10;
        }
        if (ch == 'L') {
            return 50;
        }
        if (ch == 'C') {
            return 100;
        }
        if (ch == 'D') {
            return 500;
        }
        return 1000;
    }
}
