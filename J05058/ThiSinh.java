package J05058;

import java.util.Comparator;

public class ThiSinh implements Comparable<ThiSinh> {
    private String ma;
    private String ten;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double tongDiem;

    public ThiSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        tongDiem = diemHoa + diemLy + diemToan * 2 + getUuTien();
    }

    private double getUuTien() {
        char khuVuc = ma.charAt(2);
        if(khuVuc == '1') {
            return 0.5;
        } else if (khuVuc == '2') {
            return 1.0;
        } else {
            return 2.5;
        }
    }

    private String format(double diem) {
        if (diem % 1 == 0) {
            return String.valueOf((int)diem);
        }
        return String.format("%.1f", diem);
    }

    private String getTrangThai() {
        return tongDiem >= 24 ? "TRUNG TUYEN" : "TRUOT";
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (o.tongDiem == tongDiem) {
            return ma.compareTo(o.ma);
        }
        return Double.compare(o.tongDiem, tongDiem);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", ma, ten, format(getUuTien()), format(tongDiem), getTrangThai());
    }
}
