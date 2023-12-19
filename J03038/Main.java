package J03038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(str.chars().distinct().count());
    }
}
