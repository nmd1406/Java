package J07012;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arrayList = (ArrayList<String>) inputStream.readObject();

        String inp = "";
        for (String string : arrayList) {
            inp += string.toLowerCase() + " ";
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
