package J07078;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("STRING.in"));
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String string1 = scanner.nextLine();
            String string2 = scanner.nextLine();
            int index = 0;
            while (true) {
                index = string1.indexOf(string2, index);
                if (index == -1) {
                    break;
                }
                System.out.print((index + 1) + " ");
                ++index;
            }
            System.out.println();
        }
    }
}
