package J07013;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable {
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        ma = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = dateFormat.parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %.2f", ma, ten, lop, dateFormat.format(ngaysinh), gpa);
    }
}
