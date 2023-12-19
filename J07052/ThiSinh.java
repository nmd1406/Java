package J07052;

import java.util.Comparator;
import java.util.StringTokenizer;

public class ThiSinh implements Comparable<ThiSinh> {
    private String maSV;
    private String ten;
    private double toan;
    private double ly;
    private double hoa;
    private double diem;
    private double diemUuTien;
    private String trangThai;

    public ThiSinh(String maSV, String ten, double toan, double ly, double hoa) {
        this.maSV = maSV;
        this.ten = chuanHoa(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;

        double sum = this.toan * 2 + this.ly + this.hoa;
        char khuVuc = this.maSV.charAt(2);
        switch (khuVuc) {
            case '1':
                diem = sum + 0.5;
                diemUuTien = 0.5;
                break;
            case '2':
                diem = sum + 1.0;
                diemUuTien = 1.0;
                break;
            case '3':
                diem = sum + 2.5;
                diemUuTien = 2.5;
                break;
        }
    }

    private String chuanHoa(String ten) {
        StringTokenizer tokenizer = new StringTokenizer(ten);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            builder.append(Character.toUpperCase(token.charAt(0)));
            for(int i = 1; i < token.length(); ++i) {
                builder.append(Character.toLowerCase(token.charAt(i)));
            }
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(diem == o.diem) {
            return maSV.compareTo(o.maSV);
        }
        return diem > o.diem ? -1 : 1;
    }

    public double getDiem() {
        return diem;
    }

    public void setTrangThai(double diemTrungTuyen) {
        trangThai = diemTrungTuyen > diem ? "TRUOT" : "TRUNG TUYEN";
    }

    private String numFormat(double num) {
        String str = "";
        if(num % 1 == 0) {
            str = String.format("%.0f", num);
        } else {
            str = String.format("%.1f", num);
        }
        return str;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", maSV, ten, numFormat(diemUuTien), numFormat(diem), trangThai);
    }
}
