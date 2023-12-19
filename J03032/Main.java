package J03032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String str = scanner.nextLine();
            String[] arr = str.split("\\s+");
            for(String s : arr) {
                StringBuilder temp = new StringBuilder(s);
                System.out.print(temp.reverse() + " ");
            }
            System.out.println();
        }
    }
}
