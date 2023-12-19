package J05027;

import java.util.StringTokenizer;

public class GiangVien {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String mon;

    public GiangVien(String ten, String mon) {
        ma = String.format("GV%02d", last_id++);
        this.ten = ten;
        this.mon = mon;
    }

    public String getTen() {
        return ten;
    }

    private String boMonVietTat() {
        StringTokenizer tokenizer = new StringTokenizer(mon);
        StringBuilder stringBuilder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            stringBuilder.append(tokenizer.nextToken().substring(0, 1).toUpperCase());
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", ma, ten, boMonVietTat());
    }
}
