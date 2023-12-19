package J03040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            String str = scanner.next().substring(5);
            str = str.substring(0, 3) + str.substring(4);

            if(tangChat(str) || bangNhau(str) || check1(str) || locPhat(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean tangChat(String str) {
        for(int i = 0; i < str.length() - 1; ++i) {
            if(str.charAt(i) >= str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean bangNhau(String str) {
        for(int i = 0; i < str.length() - 1; ++i) {
            if(str.charAt(i) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean check1(String str) {
        return (str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2)) && (str.charAt(3) == str.charAt(4));
    }

    public static boolean locPhat(String str) {
        for(int i = 0; i < str.length() - 1; ++i) {
            if(str.charAt(i) != '6' && str.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }
}
