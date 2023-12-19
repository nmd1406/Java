package J01010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = Integer.parseInt(scanner.nextLine());

        while (test-- > 0) {
            String str = scanner.nextLine();

            System.out.println(solve(str));
        }
    }

    public static String solve(String str) {
        char[] chArr = str.toCharArray();

        for(int i = 0; i < str.length(); ++i) {
            if(chArr[i] == '0' || chArr[i] == '1' || chArr[i] == '8' || chArr[i] == '9') {
                if(chArr[i] == '8' || chArr[i] == '9') {
                    chArr[i] = '0';
                }
            } else {
                return "INVALID";
            }
        }

        String res = "";
        int i = 0;
        while (i < str.length() && chArr[i] == '0') {
            ++i;
        }
        while (i < str.length()) {
            res += chArr[i];
            ++i;
        }

        return res.length() == 0 ? "INVALID" : res;
    }
}
