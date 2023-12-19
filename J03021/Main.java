package J03021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            String str = scanner.next().toLowerCase();
            String text = "";

            for(int i = 0; i < str.length(); ++i) {
                text += cucGach(str.charAt(i));
            }

            StringBuilder rev = new StringBuilder(text).reverse();
            if(text.contentEquals(rev)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static char cucGach(char ch) {
        if(ch <= 'c') {
            return '2';
        }
        if(ch <= 'f') {
            return '3';
        }
        if(ch <= 'i') {
            return '4';
        }
        if(ch <= 'l') {
            return '5';
        }
        if(ch <= 'o') {
            return '6';
        }
        if(ch <= 's') {
            return '7';
        }
        if(ch <= 'v') {
            return '8';
        }

        return '9';
    }
}
