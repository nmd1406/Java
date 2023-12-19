package J07053;

import java.util.StringTokenizer;

public class ThiSinh {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String dob;
    private double diemLyThuyet;
    private double diemThucHanh;
    private double diemThuong;

    public ThiSinh(String ten, String dob, double diemLyThuyet, double diemThucHanh){
        ma = String.format("PH%02d", last_id++);
        this.ten = chuanHoa(ten);
        this.dob = dob;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;

        if (diemLyThuyet >= 8 && diemThucHanh >= 8) {
            diemThuong = 1.0;
        } else if (diemLyThuyet >= 7.5 && diemThucHanh >= 7.5) {
            diemThuong = 0.5;
        } else {
            diemThuong = 0.0;
        }
    }

    private String chuanHoa(String ten) {
        StringTokenizer tokenizer = new StringTokenizer(ten);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            builder.append(Character.toUpperCase(token.charAt(0)));
            builder.append(token.substring(1).toLowerCase());
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    private int getTuoi() {
        return 2021 - Integer.parseInt(dob.split("/")[2]);
    }

    private int diemTrungBinh() {
        int diem = Math.toIntExact(Math.round((diemLyThuyet + diemThucHanh) / 2 + diemThuong));
        return Math.min(diem, 10);
    }

    public String getXepLoai() {
        int diem = diemTrungBinh();
        if(diem < 5) {
            return "Truot";
        } else if (diem < 7) {
            return "Trung binh";
        } else if (diem < 8) {
            return "Kha";
        } else if (diem < 9){
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %s", ma, ten, getTuoi(), diemTrungBinh(), getXepLoai());
    }
}
