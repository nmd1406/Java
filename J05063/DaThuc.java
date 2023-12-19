package J05063;

import java.util.Map;
import java.util.TreeMap;

public class DaThuc {
    private String daThuc;

    public DaThuc(String daThuc) {
        this.daThuc = daThuc;
    }

    public DaThuc cong(DaThuc d) {
        Map<Integer, Integer> map = new TreeMap<>();
        String[] s1 = daThuc.split("[*x^ +]+");
        String[] s2 = d.daThuc.split("[*x^ +]+");

        for (int i = 1; i < s1.length; i += 2) {
            map.put(Integer.parseInt(s1[i]), Integer.parseInt(s1[i - 1]));
        }

        for (int i = 1; i < s2.length; i += 2) {
            int key = Integer.parseInt(s2[i]);
            int value = Integer.parseInt(s2[i - 1]);

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }

        String temp = "";
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            temp = String.valueOf(entry.getValue()) + "*x^" + String.valueOf(entry.getKey()) + " + " + temp;
        }

        temp = temp.substring(0, temp.length() - 3);
        return new DaThuc(temp);
    }

    @Override
    public String toString() {
        return daThuc;
    }
}
