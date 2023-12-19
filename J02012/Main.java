package J02012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            arr.add(scanner.nextInt());
            System.out.printf("Buoc %d: ", i);
            Collections.sort(arr);
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
