package J08024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            solve(n);
        }
    }

    public static void solve(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(9);

        while (!queue.isEmpty()) {
            int num = queue.peek();
            queue.remove();

            if (num % n == 0) {
                System.out.println(num);
                break;
            }

            queue.add(num * 10);
            queue.add(num * 10 + 9);
        }
    }
}
