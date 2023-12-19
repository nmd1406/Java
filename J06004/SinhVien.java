package J06004;

public class SinhVien implements Comparable<SinhVien> {
    private String ma;
    private String ten;
    private String sdt;
    private int nhom;

    public SinhVien(String ma, String ten, String sdt, int nhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public int getNhom() {
        return nhom;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", ma, ten, sdt, nhom);
    }

    @Override
    public int compareTo(SinhVien o) {
        return ma.compareTo(o.ma);
    }
}
