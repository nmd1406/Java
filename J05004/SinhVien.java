package J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class SinhVien {
    private String ma;
    private String ten;
    private String lop;
    private String dob;
    private double gpa;

    public SinhVien(int n, String ten, String lop, String dob, double gpa) {
        this.ma = "B20DCCN" + String.format("%03d", n);
        this.ten = chuanHoa(ten);
        this.lop = lop;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            this.dob = formatter.format(formatter.parse(dob));
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        this.gpa = gpa;
    }

    private String chuanHoa(String ten) {
        StringTokenizer tokens = new StringTokenizer(ten);
        StringBuilder newTen = new StringBuilder();
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            newTen.append(Character.toUpperCase(token.charAt(0)));
            newTen.append(token.substring(1).toLowerCase());
            newTen.append(" ");
        }
        return newTen.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s%s %s %.2f", ma, ten, lop, dob, gpa);
    }
}
