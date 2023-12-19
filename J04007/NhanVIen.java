package J04007;

public class NhanVIen {
    private final String ma = "00001";
    private String ten;
    private String gioiTinh;
    private String dob;
    private String diaChi;
    private String maThue;
    private String ngayKiHopDong;

    public NhanVIen(String ten, String gioiTinh, String dob, String diaChi, String maThue, String ngayKiHopDong) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.dob = dob;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", ma, ten, gioiTinh, dob, diaChi, maThue, ngayKiHopDong);
    }
}
