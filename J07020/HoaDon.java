package J07020;

public class HoaDon {
    private static int last_id = 1;
    private String ma;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(KhachHang khachHang, MatHang matHang, int soLuong) {
        ma = String.format("HD%03d", last_id++);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    private int thanhTien() {
        return soLuong * matHang.getGiaBan();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", ma, khachHang, matHang, soLuong, thanhTien());
    }
}
