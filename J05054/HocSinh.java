package J05054;

public class HocSinh implements Comparable<HocSinh> {
    private static int last_id = 1;
    private String ma;
    private String hoTen;
    private double diemTB;
    private String xepLoai;
    private int xepHang;

    public HocSinh(String hoTen, double diemTB) {
        ma = String.format("HS%02d", last_id++);
        this.hoTen = hoTen;
        this.diemTB = diemTB;

        if (diemTB >= 9) {
            xepLoai = "Gioi";
        } else if (diemTB >=7) {
            xepLoai = "Kha";
        } else if (diemTB >= 5) {
            xepLoai = "Trung Binh";
        } else {
            xepLoai = "Yeu";
        }
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public int getXepHang() {
        return xepHang;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s %d", ma, hoTen, diemTB, xepLoai, xepHang);
    }

    @Override
    public int compareTo(HocSinh o) {
        return Double.compare(o.diemTB, diemTB);
    }
}
