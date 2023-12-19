package J01026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();

            if(Math.sqrt(n) == (int)(Math.sqrt(n))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
