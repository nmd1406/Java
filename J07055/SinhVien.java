package J07055;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private double diemLuyenTap;
    private double diemThucHanh;
    private double diemThi;
    private double diemTongKet;
    private String xepLoai;

    public SinhVien(String ten, double diemLuyenTap, double diemThucHanh, double diemThi) {
        ma = String.format("SV%02d", last_id++);
        this.ten = chuanHoa(ten);
        this.diemLuyenTap = diemLuyenTap;
        this.diemThucHanh = diemThucHanh;
        this.diemThi = diemThi;
        diemTongKet = diemLuyenTap * 0.25 + diemThi * 0.4 + diemThucHanh * 0.35;
        setXepLoai(diemTongKet);
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

    private void setXepLoai(double diem) {
        if (diem >= 8) {
            xepLoai = "GIOI";
        } else if (diem >= 6.5) {
            xepLoai = "KHA";
        } else if (diem >= 5) {
            xepLoai = "TRUNG BINH";
        } else {
            xepLoai = "KEM";
        }
    }

    @Override
    public int compareTo(SinhVien o) {
        return diemTongKet > o.diemTongKet ? -1 : 1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", ma, ten, diemTongKet, xepLoai);
    }
}
