package J07015;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) objectInputStream.readObject();
        int[] arr = new int[10000];
        for(int num : list) {
            arr[num]++;
        }

        for(int i = 2; i < 10000; ++i) {
            if(arr[i] > 0 && prime(i)) {
                System.out.printf("%d %d\n", i, arr[i]);
            }
        }
    }

    public static boolean prime(int num) {
        for(int i = 2; i <= Math.sqrt(num); ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
