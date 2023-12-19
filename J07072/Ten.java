package J07072;

import java.util.StringTokenizer;

public class Ten implements Comparable<Ten> {
    private String ten;

    public Ten(String ten) {
        this.ten = chuanHoa(ten);
    }

    private String chuanHoa(String ten) {
        StringTokenizer tokenizer = new StringTokenizer(ten);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            builder.append(Character.toUpperCase(token.charAt(0)));
            builder.append(token.substring(1).toLowerCase());
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    @Override
    public String toString() {
        return ten;
    }

    @Override
    public int compareTo(Ten o) {
        String[] token1 = ten.split(" ");
        String[] token2 = o.ten.split(" ");
        String name1 = token1[token1.length - 1];
        String name2 = token2[token2.length - 1];
        if (name1.equals(name2)) {
            return ten.compareTo(o.ten);
        }
        return name1.compareTo(name2);
    }
}
