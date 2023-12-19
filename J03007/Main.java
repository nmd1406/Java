package J03007;

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
        int s = 0;
        int e = str.length() - 1;

        if(str.charAt(s) != '8' && str.charAt(e) != '8') {
            return false;
        }

        int sum = 0;
        while (s < e) {
            if(str.charAt(s) != str.charAt(e)) {
                return false;
            }
            ++s;
            --e;
        }

        for(int i = 0; i < str.length(); ++i) {
            sum += (str.charAt(i) - '0');
        }

        return sum % 10 == 0;
    }
}
