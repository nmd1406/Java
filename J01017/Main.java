package J01017;

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
        for(int i = 0; i < str.length() - 1; ++i) {
            int num1 = (int)str.charAt(i);
            int num2 = (int)str.charAt(i + 1);

            if(Math.abs(num1 - num2) != 1) {
                return false;
            }
        }

        return true;
    }
}
