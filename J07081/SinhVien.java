package J07081;

public class SinhVien implements Comparable<SinhVien> {
    private String ma;
    private String ten;
    private String sdt;
    private String email;

    public SinhVien(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma, ten, sdt, email);
    }

    @Override
    public int compareTo(SinhVien o) {
        String[] token1 = ten.split(" ");
        String[] token2 = o.ten.split(" ");
        String name1 = token1[token1.length - 1];
        String name2 = token2[token2.length - 1];

        if (ten.equals(o.ten)) {
            return ma.compareTo(o.ma);
        }
        if (name1.equals(name2)) {
            return ten.compareTo(o.ten);
        }
        return name1.compareTo(name2);
    }
}
