package J05081;

public class MatHang {
    private String ma;
    private String ten;
    private String donVi;
    private int giaMua;
    private int giaBan;

    public MatHang(int i, String ten, String donVi, int giaMua, int giaBan) {
        ma = "MH" + String.format("%03d", i);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }

    public int loiNhuan() {
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", ma, ten, donVi, giaMua, giaBan, loiNhuan());
    }
}
