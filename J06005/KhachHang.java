package J06005;

import java.util.Objects;

public class KhachHang {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String gioiTinh;
    private String dob;
    private String diaChi;

    public KhachHang(String ten, String gioiTinh, String dob, String diaChi) {
        ma = String.format("KH%03d", last_id++);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.dob = dob;
        this.diaChi = diaChi;
    }

    public KhachHang(String ma) {
        this.ma = ma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KhachHang khachHang = (KhachHang) o;
        return Objects.equals(ma, khachHang.ma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ma);
    }

    @Override
    public String toString() {
        return String.format("%s %s", ten, diaChi);
    }
}
