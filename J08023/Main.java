package J08023;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(solve(arr, n));
        }
    }

    public static long solve(int[] arr, int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < n; ++i) {
            while (stack.size() > 1 && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.peek() + 1;
            stack.push(i);
        }

        stack.removeAllElements();
        stack.push(n);

        for (int i = n - 1; i >= 0; --i) {
            while (stack.size() > 1 && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.peek() - 1;
            stack.push(i);
        }

        long res = 0;
        for (int i = 0; i < n; ++i) {
            res = Math.max(res, (long) arr[i] * (right[i] - left[i] + 1));
        }

        return res;
    }
}
