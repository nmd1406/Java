package J05069;

public class Match {
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
}
