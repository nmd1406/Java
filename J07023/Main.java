package J07023;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Map<Integer, Integer> map1 = new TreeMap<>(readObject("DATA1.in"));
        Map<Integer, Integer> map2 = new TreeMap<>(readObject("DATA2.in"));

        map1.forEach((k, v) -> {
            if (map2.containsKey(k)) {
                System.out.println(k + " " + map1.get(k) + " " + map2.get(k));
            }
        });
    }

    public static Map<Integer, Integer> readObject(String fileName) throws IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        ArrayList<Integer> list = (ArrayList<Integer>) objectInputStream.readObject();
        Map<Integer, Integer> map = new TreeMap<>();
        list.forEach(num -> {
            if (check(num)) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
        });

        return map;
    }

    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int n) {
        if (!prime(n)) {
            return false;
        }

        String s = String.valueOf(n);
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}
