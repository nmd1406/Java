package J07005;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[1005];
        DataInputStream inputStream = new DataInputStream(new FileInputStream("DATA.IN"));
        for(int i = 1; i <= 100000; ++i) {
            arr[inputStream.readInt()]++;
        }
        inputStream.close();

        for(int i = 0; i <= 1000; ++i) {
            if(arr[i] > 0) {
                System.out.printf("%d %d\n", i, arr[i]);
            }
        }
    }
}
