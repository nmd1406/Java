package J07071;

import java.util.StringTokenizer;

public class Ten implements Comparable<Ten> {
    private String hoTen;
    private String vietTat;
    private String ten;

    public Ten(String hoTen) {
        this.hoTen = hoTen;
        StringTokenizer tokenizer = new StringTokenizer(this.hoTen);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            ten = token;
            builder.append(token.toUpperCase().charAt(0)).append(".");
        }
        builder.deleteCharAt(builder.length() - 1);
        vietTat = builder.toString();
    }

    @Override
    public String toString() {
        return hoTen;
    }

    public boolean compare(String str) {
        if (str.length() != vietTat.length()) {
            return false;
        }

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '*') {
                continue;
            }
            if (str.charAt(i) != vietTat.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Ten o) {
        if (ten.equals(o.ten)) {
            return hoTen.compareTo(o.hoTen);
        }
        return ten.compareTo(o.ten);
    }
}
