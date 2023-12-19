package J05024;

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

    public String getNganh() {
        String nganh = ma.substring(3, 7);
        if (nganh.equals("DCKT")) {
            return "KE TOAN";
        } else if (nganh.equals("DCCN")) {
            return "CONG NGHE THONG TIN";
        } else if (nganh.equals("DCAT")) {
            return "AN TOAN THONG TIN";
        } else if (nganh.equals("DCVT")) {
            return "VIEN THONG";
        }
        return "DIEN TU";
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma, ten, lop, email);
    }
}
