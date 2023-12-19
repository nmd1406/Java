package J05057;

public class ThiSinh {
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
        tongDiem = diemHoa + diemLy + diemToan * 2;
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
        double temp = getUuTien() + tongDiem;
        return temp >= 24 ? "TRUNG TUYEN" : "TRUOT";
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", ma, ten, format(getUuTien()), format(tongDiem), getTrangThai());
    }
}
