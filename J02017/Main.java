package J02017;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }

        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; ++i) {
            if(s.empty()) {
                s.push(arr[i]);
            } else {
                if((s.peek() + arr[i]) % 2 == 0) {
                    s.pop();
                } else {
                    s.push(arr[i]);
                }
            }
        }

        System.out.println(s.size());
    }
}
