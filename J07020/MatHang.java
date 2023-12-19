package J07020;

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

    public int getGiaBan() {
        return giaBan;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", ten, donVi, giaMua, giaBan);
    }
}
