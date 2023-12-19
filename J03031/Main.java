package J03031;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String str = scanner.nextLine();
            int k = Integer.parseInt(scanner.nextLine());
            Set<Character> set = new HashSet<>();
            int length = str.length();
            for (int i = 0; i < length; ++i) {
                set.add(str.charAt(i));
            }
            if (set.size() + k >= 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
