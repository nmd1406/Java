package J05020;

public class SinhVien implements Comparable<SinhVien> {
    private String ma;
    private String ten;
    private String lop;
    private String email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma, ten, lop, email);
    }

    @Override
    public int compareTo(SinhVien o) {
        if (lop.equals(o.lop)) {
            return ma.compareTo(o.ma);
        }
        return lop.compareTo(o.lop);
    }
}
