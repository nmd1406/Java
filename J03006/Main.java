package J03006;

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
        int len = str.length();
        int s = 0;
        int e = len - 1;

        while (s < e) {
            int curr = (int)str.charAt(s);
            if(curr % 2 != 0) {
                return false;
            }
            if(str.charAt(s) != str.charAt(e)) {
                return false;
            }
            ++s;
            --e;
        }

        return true;
    }
}
