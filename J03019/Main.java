package J03019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        int pos = 0;
        for (int i = 0; i < length; ++i) {
            char ch = str.charAt(i);
            for (int j = pos; j < length; ++j) {
                if (str.charAt(j) > ch) {
                    ch = str.charAt(j);
                    pos = j;
                }
            }
            for (int k = pos; k < length; ++k) {
                if (str.charAt(k) == ch) {
                    System.out.print(str.charAt(k));
                    pos = k + 1;
                }
            }
        }
    }
}
