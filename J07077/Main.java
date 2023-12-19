package J07077;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("BIEUTHUC.in"));
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String inp = scanner.nextLine();
            System.out.println(eval(inp));
        }
    }

    public static int getPrecedence(char op) {
        if (op == '*' || op == '/') {
            return 2;
        }
        if (op == '+' || op == '-') {
            return 1;
        }
        return 0;
    }

    public static long calc(char op, long a, long b) {
        if (op == '+') {
            return a + b;
        }
        if (op == '-') {
            return a - b;
        }
        if (op == '*') {
            return a * b;
        }
        return a / b;
    }

    public static long eval(String inp) {
        Stack<Long> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();
        for (int i = 0; i < inp.length(); ++i) {
            if (inp.charAt(i) == '(') {
                opStack.push(inp.charAt(i));
            } else if(Character.isDigit(inp.charAt(i))) {
                long num = 0;
                while (i < inp.length() && Character.isDigit(inp.charAt(i))) {
                    num = num * 10 + (inp.charAt(i) - '0');
                    ++i;
                }
                numStack.push(num);
                --i;
            } else if (inp.charAt(i) == ')') {
                while (opStack.peek() != '(') {
                    long b = numStack.pop();
                    long a = numStack.pop();
                    numStack.push(calc(opStack.pop(), a, b));
                }
                opStack.pop();
            } else {
                while (!opStack.empty() && (getPrecedence(opStack.peek()) >= getPrecedence(inp.charAt(i)))) {
                    long b = numStack.pop();
                    long a = numStack.pop();
                    numStack.push(calc(opStack.pop(), a, b));
                }
                opStack.push(inp.charAt(i));
            }
        }
        while (!opStack.empty()) {
            long b = numStack.pop();
            long a = numStack.pop();
            numStack.push(calc(opStack.pop(), a, b));
        }
        return numStack.peek();
    }
}
