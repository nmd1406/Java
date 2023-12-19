package J07058;

public class MonHoc implements Comparable<MonHoc> {
    private String ma;
    private String ten;
    private String hinhThuc;

    public MonHoc(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", ma, ten, hinhThuc);
    }

    @Override
    public int compareTo(MonHoc o) {
        return ma.compareTo(o.ma);
    }
}
