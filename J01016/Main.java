package J01016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int count = 0;
        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) == '4' || str.charAt(i) == '7') {
                ++count;
            }
        }

        if(count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
