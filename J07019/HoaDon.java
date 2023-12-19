package J07019;

public class HoaDon {
    private static int last_id = 1;
    private String ma;
    private int soLuong;
    private QuanAo quanAo;
    private long tongTien;
    private long giamGia;

    public HoaDon(String ma, int soLuong, QuanAo quanAo) {
        this.ma = String.format("%s-%03d", ma, last_id++);
        this.soLuong = soLuong;
        this.quanAo = quanAo;
        setTongTien();
    }

    private void setTongTien() {
        char loai = ma.charAt(2);
        long temp = quanAo.getGia(loai) * soLuong;
        if (soLuong >= 150) {
            tongTien = temp * 50 / 100;
            giamGia = temp * 50 / 100;
        } else if (soLuong >= 100) {
            tongTien = temp * 70 / 100;
            giamGia = temp * 30 / 100;
        } else if (soLuong >= 50) {
            tongTien = temp * 85 / 100;
            giamGia = temp * 15 / 100;
        } else {
            tongTien = temp;
            giamGia = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", ma, quanAo, giamGia, tongTien);
    }
}
