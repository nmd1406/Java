package J06005;

import java.util.Objects;

public class MatHang {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String donVi;
    private int giaMua;
    private int giaBan;

    public MatHang(String ten, String donVi, int giaMua, int giaBan) {
        ma = String.format("MH%03d", last_id++);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public MatHang(String ma) {
        this.ma = ma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatHang matHang = (MatHang) o;
        return Objects.equals(ma, matHang.ma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ma);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", ten, donVi, giaMua, giaBan);
    }
}
