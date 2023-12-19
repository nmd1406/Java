package J08021;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            String inp = scanner.next();
            System.out.println(solve(inp));
        }
    }

    public static int solve(String inp) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int res = 0;

        for(int i = 0; i < inp.length(); ++i) {
            if(inp.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if(!stack.isEmpty()) {
                    int j = stack.peek();
                    res = Math.max(res, i - j);
                } else {
                    stack.push(i);
                }
            }
        }

        return res;
    }
}
