package J07072;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        List<Ten> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(new Ten(scanner.nextLine()));
        }
        list.sort(null);
        list.forEach(System.out::println);
    }
}
