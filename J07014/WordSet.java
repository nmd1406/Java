package J07014;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WordSet {
    private String str;

    public WordSet(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine()).append(" ");
        }

        str = stringBuilder.toString();
    }

    public String union(WordSet s) {
        StringTokenizer tokenizer = new StringTokenizer(str);
        Set<String> set = new TreeSet<>();
        while (tokenizer.hasMoreTokens()) {
            set.add(tokenizer.nextToken().toLowerCase());
        }
        tokenizer = new StringTokenizer(s.str);
        while (tokenizer.hasMoreTokens()) {
            set.add(tokenizer.nextToken().toLowerCase());
        }

        StringBuilder stringBuilder = new StringBuilder();
        set.forEach(ele ->  stringBuilder.append(ele).append(" "));

        return stringBuilder.toString();
    }

    public String intersection(WordSet s) {
        StringTokenizer tokenizer = new StringTokenizer(str);
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new HashSet<>();
        while (tokenizer.hasMoreTokens()) {
            set1.add(tokenizer.nextToken().toLowerCase());
        }
        tokenizer = new StringTokenizer(s.str);
        while (tokenizer.hasMoreTokens()) {
            set2.add(tokenizer.nextToken().toLowerCase());
        }

        StringBuilder stringBuilder = new StringBuilder();
        set1.forEach(ele -> {
            if(set2.contains(ele)) {
                stringBuilder.append(ele).append(" ");
            }
        });

        return stringBuilder.toString();
    }

    public String difference(WordSet s) {
        StringTokenizer tokenizer = new StringTokenizer(str);
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new HashSet<>();

        while (tokenizer.hasMoreTokens()) {
            set1.add(tokenizer.nextToken().toLowerCase());
        }
        tokenizer = new StringTokenizer(s.str);
        while (tokenizer.hasMoreTokens()) {
            set2.add(tokenizer.nextToken().toLowerCase());
        }

        StringBuilder stringBuilder = new StringBuilder();
        set1.forEach(ele -> {
            if(!set2.contains(ele)) {
                stringBuilder.append(ele).append(" ");
            }
        });

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return str;
    }
}
