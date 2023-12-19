package J07046;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Khach implements Comparable<Khach> {
    private static int last_id = 1;
    private String maKhach;
    private String ten;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;

    public Khach(String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.maKhach = String.format("KH%02d", last_id++);
        this.ten = ten;
        this.maPhong = maPhong;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayDen = format.parse(ngayDen);
        this.ngayDi = format.parse(ngayDi);
    }

    private long getSoNgay() {
        return (ngayDi.getTime() - ngayDen.getTime()) / (24 * 60 * 60 * 1000);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", maKhach, ten, maPhong, getSoNgay());
    }

    @Override
    public int compareTo(Khach o) {
        return (int)(o.getSoNgay() - getSoNgay());
    }
}