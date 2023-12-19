package J07050;

public class MatHang implements Comparable<MatHang> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String nhom;
    private double giaMua;
    private double giaBan;

    public MatHang(String ten, String nhom, double giaMua, double giaBan) {
        ma = String.format("MH%02d", last_id++);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    private double loiNhuan() {
        return giaBan - giaMua;
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.loiNhuan(), loiNhuan());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", ma, ten, nhom, loiNhuan());
    }
}
