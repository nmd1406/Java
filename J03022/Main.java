package J03022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String line = "";
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (str.isEmpty()) {
                break;
            }

            int length = str.length();
            if (str.charAt(length - 1) == '.' || str.charAt(length - 1) == '!' || str.charAt(length - 1) == '?') {
                line += str.substring(0, length - 1).trim();
                list.add(line);
                line = "";
            } else {
                line += str + " ";
            }
        }
        list.forEach(str -> System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase()));
    }
}
