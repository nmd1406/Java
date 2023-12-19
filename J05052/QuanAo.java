package J05052;

public class QuanAo {
    private String ten;
    private String ma;
    private long gia;
    private long qty;

    public QuanAo(String ten, String ma, long gia, long qty) {
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.qty = qty;
    }

    private char getLoai() {
        return ma.charAt(ma.length() - 1);
    }

    private String getStt() {
        return ma.substring(1, 4);
    }

    private long giamGia() {
        if (getLoai() == '2') {
            return (long) (gia * qty * 30 / 100);
        }
        return (long) (gia * qty * 50 / 100);
    }

    private long thanhTien() {
        if (getLoai() == '2') {
            return (long) (gia * qty * 70 / 100);
        }
        return (long) (gia * qty * 50 / 100);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", ten, ma, getStt(), giamGia(), thanhTien());
    }
}
