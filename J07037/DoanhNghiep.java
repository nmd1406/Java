package J07037;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma;
    private String ten;
    private int soSv;

    public DoanhNghiep(String ma, String ten, int soSv) {
        this.ma = ma;
        this.ten = ten;
        this.soSv = soSv;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", ma, ten, soSv);
    }
}
