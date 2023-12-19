package J08020;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            String inp = scanner.next();
            if(isValid(inp)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isValid(String inp) {
        if (inp.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < inp.length(); ++i) {
            if (inp.charAt(i) == '(' || inp.charAt(i) == '{' || inp.charAt(i) == '[') {
                stack.push(inp.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (inp.charAt(i) == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (inp.charAt(i) == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (inp.charAt(i) == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
