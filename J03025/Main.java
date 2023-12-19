package J03025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            String str = scanner.next();

            int s = 0;
            int e = str.length() - 1;
            int count = 0;
            while (s < e) {
                if(str.charAt(s) != str.charAt(e)) {
                    ++count;
                }
                ++s;
                --e;
            }

            if(count == 1 && str.length() % 2 == 0) {
                System.out.println("YES");
            } else if(count <= 1 && str.length() % 2 == 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
