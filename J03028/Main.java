package J03028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String str = scanner.nextLine();
            int length = str.length();
            String s1 = str.substring(0, length / 2);
            String s2 = str.substring(length / 2);
            s1 = rotate(s1);
            s2 = rotate(s2);
            System.out.println(merge(s1, s2));
        }
    }

    public static String rotate(String str) {
        int rotationValue = 0;
        for (int i = 0; i < str.length(); ++i) {
            rotationValue += (str.charAt(i) - 'A');
        }

        StringBuilder rotatedStr = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            int rotatedChar = (str.charAt(i) - 'A' + rotationValue) % 26 + 'A';
            rotatedStr.append((char) rotatedChar);
        }

        return rotatedStr.toString();
    }

    public static String merge(String str1, String str2) {
        StringBuilder mergedStr = new StringBuilder();
        for(int i = 0; i < str1.length(); ++i) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            int rotationValue = ch2 - 'A';
            int rotatedChar = (ch1 - 'A' + rotationValue) % 26 + 'A';
            mergedStr.append((char) rotatedChar);
        }

        return mergedStr.toString();
    }
}
