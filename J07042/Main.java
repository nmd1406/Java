package J07042;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) objectInputStream.readObject();
        Set<Pair> set = new LinkedHashSet<>();
        list.forEach(pair -> {
            if (pair.getFirst() < pair.getSecond() && gcd(pair.getFirst(), pair.getSecond()) == 1) {
                set.add(pair);
            }
        });

        List<Pair> pairList = new ArrayList<>(set);
        pairList.sort(null);
        pairList.forEach(System.out::println);
    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }

        return gcd(b, a % b);
    }
}
