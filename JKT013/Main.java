package JKT013;

import java.util.*;

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
        Queue<String> queue = new LinkedList<>();
        queue.add("6");
        queue.add("8");

        List<String> list = new ArrayList<>();
        while (true) {
            String temp = queue.peek();
            queue.remove();
            list.add(temp);

            if(temp.length() < n) {
                queue.add(temp + "6");
                queue.add(temp + "8");
            } else {
                break;
            }
        }

        while (!queue.isEmpty()) {
            list.add(queue.peek());
            queue.remove();
        }

        System.out.println(list.size());
        for (int i = list.size() - 1; i >= 0; --i) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
