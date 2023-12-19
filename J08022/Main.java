package J08022;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
            }

            Stack<Integer> stack = new Stack<>();
            int[] res = new int[n];
            for(int i = n - 1; i >= 0; --i) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if(stack.empty()) {
                    res[i] = -1;
                } else {
                    res[i] = stack.peek();
                }

                stack.push(arr[i]);
            }

            for(int i = 0; i < n; ++i) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
