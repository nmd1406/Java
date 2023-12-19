package TN02012;

public class NhanVien {
    private String ma;
    private String ten;
    private int luongCoBan;
    private int ngayCong;
    private int luongThang;
    private String phongBan;

    public NhanVien(String ma, String ten, int luongCoBan, int ngayCong, String phongBan) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.phongBan = phongBan;
    }

    public void setLuongThang(char nhom, int yearCount) {
        if (nhom == 'A') {
            if (yearCount >= 16) {
                luongThang = luongCoBan * 1000 * ngayCong * 20;
            } else if (yearCount >= 9) {
                luongThang = luongCoBan * 1000 * ngayCong * 14;
            } else if (yearCount >= 4) {
                luongThang = luongCoBan * 1000 * ngayCong * 12;
            } else {
                luongThang = luongCoBan * 1000 * ngayCong * 10;
            }
        } else if (nhom == 'B') {
            if (yearCount >= 16) {
                luongThang = luongCoBan * 1000 * ngayCong * 16;
            } else if (yearCount >= 9) {
                luongThang = luongCoBan * 1000 * ngayCong * 13;
            } else if (yearCount >= 4) {
                luongThang = luongCoBan * 1000 * ngayCong * 11;
            } else {
                luongThang = luongCoBan * 1000 * ngayCong * 10;
            }
        } else if (nhom == 'C') {
            if (yearCount >= 16) {
                luongThang = luongCoBan * 1000 * ngayCong * 14;
            } else if (yearCount >= 9) {
                luongThang = luongCoBan * 1000 * ngayCong * 12;
            } else if (yearCount >= 4) {
                luongThang = luongCoBan * 1000 * ngayCong * 10;
            } else {
                luongThang = luongCoBan * 1000 * ngayCong * 9;
            }
        } else {
            if (yearCount >= 16) {
                luongThang = luongCoBan * 1000 * ngayCong * 13;
            } else if (yearCount >= 9) {
                luongThang = luongCoBan * 1000 * ngayCong * 11;
            } else if (yearCount >= 4) {
                luongThang = luongCoBan * 1000 * ngayCong * 9;
            } else {
                luongThang = luongCoBan * 1000 * ngayCong * 8;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", ma, ten, phongBan, luongThang);
    }
}
