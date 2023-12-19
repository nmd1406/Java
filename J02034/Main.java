package J02034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] map = new int[204];

        for(int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
            map[arr[i]] = 1;
        }

        boolean isMissing = false;
        for(int i = 1; i <= arr[n - 1]; ++i) {
            if(map[i] != 1) {
                isMissing = true;
                System.out.println(i);
            }
        }

        if(isMissing == false) {
            System.out.println("Excellent!");
        }
    }
}
