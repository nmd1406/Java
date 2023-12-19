package J07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1010];
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Admin\\OneDrive - vn.edu.ptit.edu.vn\\Java\\src\\J07004\\data.txt"));
            while (scanner.hasNextInt()) {
                arr[scanner.nextInt()]++;
            }
            for(int i = 0; i <= 1000; ++i) {
                if(arr[i] > 0) {
                    System.out.println(i + " " + arr[i]);
                   }
            }
            scanner.close();
        } catch (FileNotFoundException e) {

        }
    }
}
