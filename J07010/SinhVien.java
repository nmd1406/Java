package J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String lop;
    private String dob;
    private double gpa;

    public SinhVien(String ten, String lop, String dob, double gpa) throws ParseException {
        ma = "B20DCCN" + String.format("%03d", last_id++);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.dob = format.format(format.parse(dob));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", ma, ten, lop, dob, gpa);
    }
}
