package J06006;

import java.util.List;

public class HoaDon implements Comparable<HoaDon> {
    private static int last_id = 1;
    private String ma;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;
    private int thanhTien;
    private int loiNhuan;

    public HoaDon(String maKhachHang, String maMatHang, int soLuong, List<KhachHang> khachHangList, List<MatHang> matHangList) {
        ma = String.format("HD%03d", last_id++);
        khachHang = khachHangList.get(khachHangList.indexOf(new KhachHang(maKhachHang)));
        matHang = matHangList.get(matHangList.indexOf(new MatHang(maMatHang)));
        this.soLuong = soLuong;
        setThanhTien();
        setLoiNhuan();
    }

    private void setThanhTien() {
        thanhTien = matHang.getGiaBan() * soLuong;
    }

    private void setLoiNhuan() {
        loiNhuan = thanhTien - matHang.getGiaMua() * soLuong;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", ma, khachHang, matHang, soLuong, thanhTien, loiNhuan);
    }

    @Override
    public int compareTo(HoaDon o) {
        return o.loiNhuan - loiNhuan;
    }
}
