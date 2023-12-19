package J08026;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            System.out.println(solve(s, t));
        }
    }

    public static int solve(int s, int t) {
        int[] dp = new int[20001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

        while (dp[t] == 0) {
            int top = queue.remove();

            if (top - 1 > 0 && dp[top - 1] == 0) {
                dp[top - 1] = dp[top] + 1;
                queue.add(top - 1);
            }

            if (top * 2 < 20000 && dp[top * 2] == 0) {
                dp[top * 2] = dp[top] + 1;
                queue.add(top * 2);
            }
        }

        return dp[t];
    }
}
