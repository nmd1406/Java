package J05010;

public class MatHang implements Comparable<MatHang> {
    private static int last_id = 1;
    private int ma;
    private String ten;
    private String nhom;
    private double giaMua;
    private double giaBan;

    public MatHang(String ten, String nhom, double giaMua, double giaBan) {
        ma = last_id++;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    private double getLoiNhuan() {
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f", ma, ten, nhom, getLoiNhuan());
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.getLoiNhuan(), getLoiNhuan());
    }
}
