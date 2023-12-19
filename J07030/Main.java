package J07030;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    static boolean[] prime = new boolean[1000001];

    public static void sieve() {
        for(int i = 2; i <= 1000000; ++i) {
            prime[i] = true;
        }

        for (int i = 2; i <= 1000; ++i) {
            if (prime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> list1 = new TreeSet<>((ArrayList<Integer>) objectInputStream1.readObject());
        Set<Integer> list2 = new HashSet<>((ArrayList<Integer>) objectInputStream2.readObject());

        for (int num : list1) {
            int m = 1000000 - num;
            if (num < m && prime[num] && list2.contains(m) && prime[m]) {
                System.out.println(num + " " + m);
            }
        }
    }
}
