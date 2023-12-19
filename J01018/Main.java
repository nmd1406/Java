package J01018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            String str = scanner.next();

            if(check(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(String str) {
        int sum = (int)str.charAt(str.length() - 1) - '0';
        for(int i = 0; i < str.length() - 1; ++i) {
            int num1 = (int)str.charAt(i) - '0';
            int num2 = (int)str.charAt(i + 1) - '0';

            if(Math.abs(num1 - num2) != 2) {
                return false;
            }
            sum += num1;
        }
        return (sum % 10 == 0);
    }
}
