package J03011;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            System.out.println(a.gcd(b));
        }
    }
}
