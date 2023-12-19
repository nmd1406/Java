package J08011;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (scanner.hasNext()) {
            String num = scanner.next();
            if (check(num)) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        list.forEach(pair -> System.out.println(pair.getKey() + " " + pair.getValue()));
    }

    public static boolean check(String num) {
        for (int i = 0; i < num.length() - 1; ++i) {
            if (num.charAt(i) > num.charAt(i + 1)) {

                return false;
            }
        }
        return true;
    }
}
