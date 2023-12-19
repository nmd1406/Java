package J03013;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            String res = String.valueOf(a.subtract(b).abs());
            int maxLen = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            while (res.length() < maxLen) {
                res = "0" + res;
            }
            System.out.println(res);
        }
    }
}
