package J08010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        int maxLength = 0;
        while (scanner.hasNext()) {
            String string = scanner.next();
            if (string.contentEquals(new StringBuilder(string).reverse())) {
                maxLength = Math.max(maxLength, string.length());
                if (map.containsKey(string)) {
                    map.put(string, map.get(string) + 1);
                } else {
                    map.put(string, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().length() == maxLength) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
