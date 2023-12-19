package J07022;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DATA.in"));

        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String str = scanner.next();
            try {
                int num = Integer.parseInt(str);
            } catch (NumberFormatException exception) {
                list.add(str);
            }
        }

        list.sort(Comparator.naturalOrder());
        list.forEach(s -> System.out.print(s + " "));
    }
}
