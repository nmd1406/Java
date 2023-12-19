package J02102;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n * n; ++i) {
            list.add(scanner.nextInt());
        }
        list.sort(Comparator.naturalOrder());

        int index = 0;
        int k = 0;
        int l = 0;
        int row = n;
        int col = n;
        int[][] arr = new int[n][n];

        while (k < row && l < col) {
            for(int i = l; i < col; ++i) {
                arr[k][i] = list.get(index++);
            }
            ++k;

            for(int i = k; i < row; ++i) {
                arr[i][col - 1] = list.get(index++);
            }
            --col;

            if(k < row) {
                for (int i = col - 1; i >= l; --i) {
                    arr[row - 1][i] = list.get(index++);
                }
                --row;
            }

            if(l < col) {
                for(int i = row - 1; i >= k; --i) {
                    arr[i][l] = list.get(index++);
                }
                ++l;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiralMatrix(List<Integer> list, int n) {

    }
}
