package J05007;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien> {
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

    @Override
    public int compareTo(NhanVien o) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = format.parse(dob);
            Date date2 = format.parse(o.dob);
            return date1.compareTo(date2);
        } catch (ParseException e) {
            return 0;
        }
    }
}
