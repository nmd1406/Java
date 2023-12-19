package J07007;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WordSet {
    private Set<String> set = new TreeSet<>();

    public WordSet(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            set.add(scanner.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(String s : set) {
            res.append(s).append("\n");
        }
        return res.toString();
    }
}
