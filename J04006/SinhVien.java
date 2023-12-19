package J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private final String ma = "B20DCCN001";
    private String ten;
    private String lop;
    private String dob;
    private float gpa;

    public SinhVien(String ten, String lop, String dob, float gpa) {
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dob = formatter.format(formatter.parse(dob));
        } catch (ParseException except) {
            except.printStackTrace();
        }
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
