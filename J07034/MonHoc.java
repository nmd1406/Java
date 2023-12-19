package J07034;

public class MonHoc implements Comparable<MonHoc> {
    private String ma;
    private String ten;
    private int soTC;

    public MonHoc(String ma, String ten, int soTC) {
        this.ma = ma;
        this.ten = ten;
        this.soTC = soTC;
    }

    @Override
    public int compareTo(MonHoc o) {
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", ma, ten, soTC);
    }
}
