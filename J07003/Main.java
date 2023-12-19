package J07003;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("DATA.in"));
            while (scanner.hasNext()) {
                String str = scanner.next();
                while (str.length() > 1) {
                    int len = str.length();
                    BigInteger a = new BigInteger(str.substring(0 , len / 2));
                    BigInteger b = new BigInteger(str.substring(len / 2));
                    BigInteger sum = a.add(b);
                    System.out.println(sum);
                    str = String.valueOf(sum);
                }
            }
        } catch (FileNotFoundException e) {

        }
    }
}
