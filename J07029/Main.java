package J07029;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arrayList = (ArrayList<Integer>) objectInputStream.readObject();
        ArrayList<Integer> prime = new ArrayList<>();
        int[] arr = new int[1000001];
        arrayList.forEach(num -> {
            if (isPrime(num)) {
                if(arr[num] == 0) {
                    prime.add(num);
                }
                ++arr[num];
            }
        });

        Collections.sort(prime, Collections.reverseOrder());
        for(int i = 0; i < 10; ++i) {
            System.out.println(prime.get(i) + " " + arr[prime.get(i)]);
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
