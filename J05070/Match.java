package J05070;

public class Match implements Comparable<Match> {
    private FC fc;
    private String maTran;
    private int coDongVien;

    public Match(FC fc, String maTran, int coDongVien) {
        this.fc = fc;
        this.maTran = maTran;
        this.coDongVien = coDongVien;
    }

    private int doanhThu() {
        return fc.getGia() * coDongVien;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", maTran, fc, doanhThu());
    }

    @Override
    public int compareTo(Match o) {
        return o.doanhThu() - doanhThu();
    }
}
