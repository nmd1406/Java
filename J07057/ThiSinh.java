package J07057;

import java.util.StringTokenizer;

public class ThiSinh implements Comparable<ThiSinh> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private double diemThi;
    private String danToc;
    private int khuVuc;
    private String trangThai;

    public ThiSinh(String ten, double diemThi, String danToc, int khuVuc) {
        ma = String.format("TS%02d", last_id++);
        this.ten = chuanHoa(ten);
        this.diemThi = diemThi;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        congDiemUuTien();
        setTrangThai();
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

    private void congDiemUuTien() {
        if (khuVuc == 1) {
            diemThi += 1.5;
        } else if (khuVuc == 2) {
            diemThi += 1.0;
        }
        if (danToc.equals("Kinh")) {
            diemThi += 0.0;
        } else {
            diemThi += 1.5;
        }
    }

    private void setTrangThai() {
        if (diemThi >= 20.5) {
            trangThai = "Do";
        } else {
            trangThai = "Truot";
        }
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (diemThi == o.diemThi) {
            return ma.compareTo(o.ma);
        }
        return diemThi > o.diemThi ? -1 : 1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", ma, ten, diemThi, trangThai);
    }
}
