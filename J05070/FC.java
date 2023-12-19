package J05070;

import java.util.Objects;

public class FC {
    private String maCLB;
    private String ten;
    private int gia;


    public FC(String maCLB, String ten, int gia) {
        this.maCLB = maCLB;
        this.ten = ten;
        this.gia = gia;
    }

    public FC(String maCLB) {
        this.maCLB = maCLB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FC fc = (FC) o;
        return Objects.equals(maCLB, fc.maCLB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maCLB);
    }

    public int getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return String.format("%s", ten);
    }
}
