package J04012;

public class NhanVien {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private int luongCoBan;
    private int ngayCong;
    private String chucVu;

    public NhanVien(String ten, int luongCoBan, int ngayCong, String chucVu) {
        ma = String.format("NV%02d", last_id++);
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
        this.luongCoBan *= ngayCong;
    }

    private int getThuong() {
        if (ngayCong >= 25) {
            return luongCoBan * 20 / 100;
        } else if (ngayCong >= 22) {
            return luongCoBan * 10 / 100;
        }
        return 0;
    }

    private int getPhuCap() {
        if (chucVu.equals("GD")) {
            return 250000;
        } else if (chucVu.equals("PGD")) {
            return 200000;
        } else if (chucVu.equals("TP")) {
            return 180000;
        }
        return 150000;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", ma, ten, luongCoBan, getThuong(), getPhuCap(), (luongCoBan + getPhuCap() + getThuong()));
    }
}
