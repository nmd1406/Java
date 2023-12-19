package J07048;

public class SanPham implements Comparable<SanPham> {
    private String ma;
    private String ten;
    private int gia;
    private int baoHanh;

    public SanPham(String ma, String ten, int gia, int baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if (o.gia == gia) {
            return ma.compareTo(o.ma);
        }
        return o.gia - gia;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", ma, ten, gia, baoHanh);
    }
}
