package J08028;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] yellow = new int[n];
        int[] blue = new int[n];
        for (int i = 0; i < n; ++i) {
            blue[i] = scanner.nextInt();
            yellow[i] = m - blue[i];
        }

        System.out.println(Math.max(solve(blue, n), solve(yellow, n)));
    }

    public static long solve(int[] blue, int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < n; ++i) {
            while (stack.size() > 1 && blue[stack.peek()] >= blue[i]) {
                stack.pop();
            }
            left[i] = stack.peek() + 1;
            stack.push(i);
        }

        stack.removeAllElements();
        stack.push(n);
        for (int i = n - 1; i >= 0; --i) {
            while (stack.size() > 1 && blue[stack.peek()] >= blue[i]) {
                stack.pop();
            }
            right[i] = stack.peek() - 1;
            stack.push(i);
        }

        long res = 0;
        for (int i = 0; i < n; ++i) {
            res = Math.max(res, (long) blue[i] * (right[i] - left[i] + 1));
        }

        return res;
    }
}
