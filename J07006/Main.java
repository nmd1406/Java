package J07006;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[1005];
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("DATA.in"));
        ObjectInputStream objectInputStream = new ObjectInputStream(dataInputStream);
        ArrayList<Integer> list = (ArrayList<Integer>) objectInputStream.readObject();

        list.forEach(num -> arr[num]++);
        for(int i = 0; i < 1000; ++i) {
            if(arr[i] > 0) {
                System.out.printf("%d %d\n", i, arr[i]);
            }
        }
    }
}
