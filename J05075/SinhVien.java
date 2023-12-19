package J05075;

import java.util.Objects;

public class SinhVien {
    private String ma;
    private String ten;
    private String lop;
    private int diemChuyenCan;

    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        diemChuyenCan = 10;
    }

    public SinhVien(String ma) {
        this.ma = ma;
    }

    private String hasDKDT() {
        return diemChuyenCan != 0 ? "" : "KDDK";
    }

    public String getLop() {
        return lop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(ma, sinhVien.ma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ma);
    }

    public void setDiemChuyenCan(String diemDanh) {
        long countVang = diemDanh.chars().filter(ch -> ch == 'v').count();
        long countMuon = diemDanh.chars().filter(ch -> ch == 'm').count();
        diemChuyenCan -= (int) (countMuon + countVang * 2);
        diemChuyenCan = Math.max(diemChuyenCan, 0);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %s", ma, ten, lop, diemChuyenCan, hasDKDT());
    }
}
