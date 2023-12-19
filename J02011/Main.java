package J02011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < n - 1; ++i) {
            System.out.printf("Buoc %d: ", i + 1);

            int pos = i;
            for(int j = i + 1; j < n; ++j) {
                if(arr[pos] > arr[j]) {
                    pos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
