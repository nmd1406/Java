package J03020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        int maxLength = 0;
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (thuanNghich(str)) {
                if (str.length() > maxLength) {
                    maxLength = str.length();
                    map.clear();
                }
                if (str.length() == maxLength) {
                    if (!map.containsKey(str)) {
                        map.put(str, 1);
                    } else {
                        map.put(str, map.get(str) + 1);
                    }
                }
            }
        }
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public static boolean thuanNghich(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; ++i) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
