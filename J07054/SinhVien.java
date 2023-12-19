package J07054;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private double diem1;
    private double diem2;
    private double diem3;
    private double diemTB;

    public SinhVien(String ten, double diem1, double diem2, double diem3) {
        ma = String.format("SV%02d", last_id++);
        this.ten = chuanHoa(ten);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        diemTB = (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8;
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

    public double getDiemTB() {
        return diemTB;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", ma, ten, diemTB);
    }

    @Override
    public int compareTo(SinhVien o) {
        if (diemTB == o.diemTB) {
            return ten.compareTo(o.ten);
        }
        return diemTB > o.diemTB ? -1 : 1;
    }
}
