package J05006;

public class NhanVien {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String gioiTinh;
    private String dob;
    private String diaChi;
    private String maThue;
    private String ngayKy;

    public NhanVien(String ten, String gioiTinh, String dob, String diaChi, String maThue, String ngayKy) {
        ma = String.format("%05d", last_id++);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.dob = dob;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKy = ngayKy;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", ma, ten, gioiTinh, dob, diaChi, maThue, ngayKy);
    }
}
