package JKT014;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for(int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
                while (stack.size() > 1 && arr[stack.peek()] <= arr[i]) {
                    stack.pop();
                }
                System.out.print((i - stack.peek()) + " ");
                stack.push(i);
            }
            System.out.println();
        }
    }
}
