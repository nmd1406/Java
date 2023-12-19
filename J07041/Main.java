package J07041;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) objectInputStream.readObject();
        Set<Pair> set = new LinkedHashSet<>();
        list.forEach(pair -> {
            if (pair.getFirst() < pair.getSecond()) {
                set.add(pair);
            }
        });

        List<Pair> pairList = new ArrayList<>(set);
        pairList.sort(null);
        pairList.forEach(System.out::println);
    }
}
