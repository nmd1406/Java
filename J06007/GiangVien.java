package J06007;

public class GiangVien {
    private String ma;
    private String ten;
    private double time;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten.substring(1);
    }

    public void setTime(double time) {
        this.time += time;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", ten, time);
    }
}
