package J05071;

public class ThanhPho {
    private String ma;
    private String ten;
    private int giaCuoc;

    public ThanhPho(String ma, String ten, int giaCuoc) {
        this.ma = ma;
        this.ten = ten;
        this.giaCuoc = giaCuoc;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaCuoc() {
        return giaCuoc;
    }

    @Override
    public String toString() {
        return ten;
    }
}
