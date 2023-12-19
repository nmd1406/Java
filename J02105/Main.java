package J02105;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        ArrayList<ArrayList<Integer>> edgeList = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            edgeList.add(new ArrayList<>());
            for(int j = 0; j < n; ++j) {
                arr[i][j] = scanner.nextInt();
                if(arr[i][j] == 1) {
                    edgeList.get(i).add(j + 1);
                }
            }
        }

        for(int i = 0; i < n; ++i) {
            System.out.printf("List(%d) = ", i + 1);
            for(int num : edgeList.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
