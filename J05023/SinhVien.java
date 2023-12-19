package J05023;

public class SinhVien {
    private String ma;
    private String ten;
    private String lop;
    private String email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getNam() {
        return "20" + lop.substring(1, 3);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma, ten, lop, email);
    }
}
