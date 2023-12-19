package J07032;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();
        Set<Integer> set1 = new TreeSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : set1) {
            if (set2.contains(num) && thuanNghich(num)) {
                list.add(num);
            }
            if (list.size() == 10) {
                break;
            }
        }

        for(int num : list) {
            System.out.println(num + " " + (Collections.frequency(list1, num) + Collections.frequency(list2, num)));
        }

    }

    public static boolean thuanNghich(int num) {
        String str = Integer.toString(num);
        int len = str.length();

        if (len % 2 == 0 || len == 1) {
            return false;
        }
        for (int i = 0; i <= len / 2; ++i) {
            if (Integer.parseInt(String.valueOf(str.charAt(i))) % 2 != 1) {
                return false;
            }
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
