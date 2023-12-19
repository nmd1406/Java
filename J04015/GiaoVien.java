package J04015;

public class GiaoVien {
    private String ma;
    private String ten;
    private String chucVu;
    private int heSo;
    private int luong;
    private int phuCap;

    public GiaoVien(String ma, String ten, int luong) {
        this.ma = ma;
        this.chucVu = this.ma.substring(0, 2);
        this.heSo = Integer.parseInt(this.ma.substring(2));
        if(this.chucVu.equals("HT")) {
            this.phuCap = 2000000;
        } else if(this.chucVu.equals("HP")) {
            this.phuCap = 900000;
        } else if(this.chucVu.equals("GV")) {
            this.phuCap = 500000;
        }
        this.ten = ten;
        this.luong = luong;
    }

    private int thuNhap() {
        return luong * heSo + phuCap;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", ma, ten, heSo, phuCap, thuNhap());
    }
}
