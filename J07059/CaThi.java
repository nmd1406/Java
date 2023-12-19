package J07059;

public class CaThi implements Comparable<CaThi> {
    private static int last_id = 1;
    private String ma;
    private String ngay;
    private String gio;
    private String id;

    public CaThi(String ngay, String gio, String id) {
        ma = String.format("C%03d", last_id++);
        this.ngay = ngay;
        this.gio = gio;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma, ngay, gio, id);
    }

    @Override
    public int compareTo(CaThi o) {
        if (ngay.equals(o.ngay)) {
            return gio.compareTo(o.gio);
        }
        return ngay.compareTo(o.ngay);
    }
}
