package J07073;

public class MonHoc implements Comparable<MonHoc> {
    private String ma;
    private String ten;
    private int soTinChi;
    private String hinhThucLyThuyet;
    private String hinhThucThucHanh;

    public MonHoc(String ma, String ten, int soTinChi, String hinhThucLyThuyet, String hinhThucThucHanh) {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
        this.hinhThucLyThuyet = hinhThucLyThuyet;
        this.hinhThucThucHanh = hinhThucThucHanh;
    }

    public String getHinhThucThucHanh() {
        return hinhThucThucHanh;
    }

    public boolean filter(String hinhThucThucHanh) {
        return hinhThucThucHanh.equals("Truc tuyen") || hinhThucThucHanh.contains(".ptit.edu.vn");
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %s", ma, ten, soTinChi, hinhThucLyThuyet, hinhThucThucHanh);
    }

    @Override
    public int compareTo(MonHoc o) {
        return ma.compareTo(o.ma);
    }
}
