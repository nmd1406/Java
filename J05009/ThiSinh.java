package J05009;

public class ThiSinh implements Comparable<ThiSinh> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String dob;
    private double diem1;
    private double diem2;
    private double diem3;

    public ThiSinh(String ten, String dob, double diem1, double diem2, double diem3) {
        ma = String.format("%d", last_id++);
        this.ten = ten;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double getTongDiem() {
        return diem1 + diem2 + diem3;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f", ma, ten, dob, getTongDiem());
    }

    @Override
    public int compareTo(ThiSinh o) {
        return Double.compare(o.getTongDiem(), getTongDiem());
    }
}
