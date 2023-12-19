package J05061;

public class ThiSinh implements Comparable<ThiSinh> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String dob;
    private double diemLyThuyet;
    private double diemThucHanh;
    private double tongDiem;

    public ThiSinh(String ten, String dob, double diemLyThuyet, double diemThucHanh) {
        ma = String.format("PH%02d", last_id++);
        this.ten = ten;
        this.dob = dob;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        tongDiem = Math.round((diemLyThuyet + diemThucHanh) / 2 + getDiemThuong());
        tongDiem = tongDiem > 10 ? 10 : tongDiem;
    }

    private double getDiemThuong() {
        if (diemLyThuyet >= 8 && diemThucHanh >= 8) {
            return 1;
        } else if (diemLyThuyet >= 7.5 && diemThucHanh >= 7.5) {
            return 0.5;
        }
        return 0;
    }

    private String getXepLoai() {
        if (tongDiem >= 9) {
            return "Xuat sac";
        } else if (tongDiem >= 8) {
            return "Gioi";
        } else if (tongDiem >= 7) {
            return "Kha";
        } else if (tongDiem >= 5) {
            return "Trung binh";
        }
        return "Truot";
    }

    private int getAge() {
        int year = Integer.parseInt(dob.substring(6));
        return 2021 - year;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (o.tongDiem == tongDiem) {
            return ma.compareTo(o.ma);
        }
        return Double.compare(o.tongDiem, tongDiem);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.0f %s", ma, ten, getAge(), tongDiem, getXepLoai());
    }
}
