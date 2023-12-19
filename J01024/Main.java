package J01024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            String str = scanner.next();
            System.out.println(check(str));
        }
    }

    public static String check(String str) {
        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) > '2') {
                return "NO";
            }
        }

        return "YES";
    }
}
