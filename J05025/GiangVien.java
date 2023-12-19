package J05025;

import java.util.StringTokenizer;

public class GiangVien implements Comparable<GiangVien> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String mon;

    public GiangVien(String ten, String mon) {
        ma = String.format("GV%02d", last_id++);
        this.ten = ten;

        StringTokenizer tokenizer = new StringTokenizer(mon);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            builder.append(tokenizer.nextToken().substring(0, 1).toUpperCase());
        }
        this.mon = builder.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", ma, ten, mon);
    }

    private String getTen() {
        String[] tokens = ten.split("\\s+");
        return tokens[tokens.length - 1];
    }

    @Override
    public int compareTo(GiangVien o) {
        if (getTen().equals(o.getTen())) {
            return ma.compareTo(o.ma);
        }
        return getTen().compareTo(o.getTen());
    }
}
