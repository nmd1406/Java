package J05011;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<User> list = new ArrayList<>();
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            list.add(new User(scanner.nextLine(), scanner.nextLine() ,scanner.nextLine(), scanner.nextLine()));
        }
        list.sort(null);
        list.forEach(System.out::println);
    }
}
