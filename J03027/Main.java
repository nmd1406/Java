package J03027;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        Stack<Character> s = new Stack<>();
        for(int i = str.length() - 1; i >= 0; --i) {
            if(!s.empty() && str.charAt(i) == s.peek()) {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
        }

        if(s.empty()) {
            System.out.println("Empty String");
        } else {
            while (!s.empty()) {
                System.out.print(s.pop());
            }
        }
    }
}
