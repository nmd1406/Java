package J03016;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            BigInteger a = new BigInteger(scanner.next());

            if(a.mod(BigInteger.valueOf(11)).compareTo(BigInteger.ZERO) == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
