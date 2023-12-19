package J07033;

import java.util.Comparator;
import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien> {
    private String ma;
    private String ten;
    private String lop;
    private String email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(String ten) {
        StringBuilder finalTen = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(ten);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            finalTen.append(Character.toUpperCase(token.charAt(0)));
            for(int i = 1; i < token.length(); ++i) {
                finalTen.append(Character.toLowerCase(token.charAt(i)));
            }
            finalTen.append(" ");
        }
        finalTen.deleteCharAt(finalTen.length() - 1);
        return finalTen.toString();
    }

    @Override
    public int compareTo(SinhVien o) {
        return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma, ten, lop, email);
    }
}
