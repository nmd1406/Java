package J02013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; ++i) {
            boolean isSwap = false;
            for(int j = 0; j < n - i - 1; ++j) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if(isSwap == false) {
                break;
            }

            System.out.printf("Buoc %d: ", i + 1);
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
