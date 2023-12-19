package J07019;

public class QuanAo {
    private String ma;
    private String ten;
    private long gia1;
    private long gia2;

    public QuanAo(String ma, String ten, long gia1, long gia2) {
        this.ma = ma;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getMa() {
        return ma;
    }

    public long getGia(char loai) {
        return loai == '1' ? gia1 : gia2;
    }

    @Override
    public String toString() {
        return ten;
    }
}
