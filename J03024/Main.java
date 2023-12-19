package J03024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            String str = scanner.next();
            System.out.println(soUuThe(str));
        }
    }

    public static String soUuThe(String str) {
        if(str.charAt(0) == '0') {
            return "INVALID";
        }

        int len = str.length();
        for(int i = 0; i < len; ++i) {
            if(Character.isLetter(str.charAt(i))) {
                return "INVALID";
            }
        }

        int countOdd = 0;
        for(int i = 0; i < len; ++i) {
            if((str.charAt(i) - '0') % 2 == 1) {
                ++countOdd;
            }
        }

        if(len % 2 == 0 && (len - countOdd) > countOdd) {
            return "YES";
        }
        if(len % 2 == 1 && (len - countOdd) < countOdd) {
            return "YES";
        }

        return "NO";
    }
}
