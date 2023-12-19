package J04022;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private String str;

    public WordSet(String str) {
        this.str = str;
    }

    public WordSet union(WordSet s) {
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

        return new WordSet(stringBuilder.toString());
    }

    public WordSet intersection(WordSet s) {
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

        return new WordSet(stringBuilder.toString());
    }

    @Override
    public String toString() {
        return str;
    }
}
