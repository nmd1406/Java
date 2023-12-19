package J07040;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner scanner = new Scanner(new File("VANBAN.in"));

        ArrayList<String> list1 = (ArrayList<String>) objectInputStream.readObject();
        ArrayList<String> list2 = new ArrayList<>();
        while (scanner.hasNext()) {
            list2.add(scanner.next().trim().toLowerCase());
        }

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        list1.forEach(str -> set1.addAll(Arrays.asList(str.trim().toLowerCase().split("\\s+"))));
        list2.forEach(str -> {
            if(set1.contains(str) && !set2.contains(str)) {
                System.out.println(str);
                set2.add(str);
            }
        });
    }
}
