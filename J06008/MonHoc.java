package J06008;


public class MonHoc {
    private String ma;
    private String ten;
    private double time;

    public MonHoc(String ma, String ten) {
        this.ma = ma;
        this.ten = ten.trim();
    }

    public String getMa() {
        return ma;
    }

    public void addTime(double time) {
        this.time += time;
    }

    public String getTen() {
        return ten;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return String.format("%s %s", ten, time);
    }
}
