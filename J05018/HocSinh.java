package J05018;

public class HocSinh implements Comparable<HocSinh> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private double[] diem = new double[10];
    private double diemTB;
    private String xepLoai;

    public HocSinh(String ten, String inp) {
        ma = String.format("HS%02d", last_id++);
        this.ten = ten;
        String[] nums = inp.split("\\s+");
        double sum = 0;
        for (int i = 0; i < 10; ++i) {
            double num = Double.parseDouble(nums[i]);
            diem[i] = num;
            if (i <= 1) {
                sum += (diem[i] * 2);
            } else {
                sum += diem[i];
            }
        }
        diemTB = sum / 12;
        diemTB = Math.round(diemTB * 10.0) / 10.0;
        setXepLoai();
    }

    private void setXepLoai() {
        if (diemTB >= 9) {
            xepLoai = "XUAT SAC";
        } else if (diemTB >= 8) {
            xepLoai = "GIOI";
        } else if (diemTB >= 7) {
            xepLoai = "KHA";
        } else if (diemTB >= 5) {
            xepLoai = "TB";
        } else {
            xepLoai = "YEU";
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", ma, ten, diemTB, xepLoai);
    }

    @Override
    public int compareTo(HocSinh o) {
        if (diemTB == o.diemTB) {
            return ma.compareTo(o.ma);
        }
        return Double.compare(o.diemTB, diemTB);
    }
}
