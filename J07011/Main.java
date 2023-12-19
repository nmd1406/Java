package J07011;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        String inp = "";
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            inp += scanner.nextLine().toLowerCase() + " ";
        }

        String[] token = inp.split("\\W+");
        Map<String, Integer> map = new HashMap<>();
        for (String string : token) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            } else {
                map.put(string, map.get(string) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            if (Objects.equals(o1.getValue(), o2.getValue())) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return o2.getValue() - o1.getValue();
        });
        list.forEach(ele -> System.out.println(ele.getKey() + " " + ele.getValue()));
    }
}
