package J03033;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());

            BigInteger ucln = a.gcd(b);
            a = a.multiply(b);
            System.out.println(a.divide(ucln));
        }
    }
}
