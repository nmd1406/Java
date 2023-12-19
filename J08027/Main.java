package J08027;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) == '<') {
                if (!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            } else if (string.charAt(i) == '>') {
                if (!stack2.empty()) {
                    stack1.push(stack2.pop());
                }
            } else if (string.charAt(i) == '-') {
                if (!stack1.empty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(string.charAt(i));
            }
        }

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        while (!stack2.empty()) {
            System.out.print(stack2.pop());
        }
    }
}
