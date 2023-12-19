package J05029;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma;
    private String ten;
    private int soSV;

    public DoanhNghiep(String ma, String ten, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public int getSoSV() {
        return soSV;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", ma, ten, soSV);
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if (soSV == o.soSV) {
            return ma.compareTo(o.ma);
        }
        return o.soSV - soSV;
    }
}
