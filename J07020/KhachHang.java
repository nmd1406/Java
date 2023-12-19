package J07020;

public class KhachHang {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String gioiTinh;
    private String dob;
    private String diaChi;

    public KhachHang(String ten, String gioiTinh, String dob, String diaChi) {
        ma = String.format("KH%03d", last_id++);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.dob = dob;
        this.diaChi = diaChi;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return String.format("%s %s", ten, diaChi);
    }
}
