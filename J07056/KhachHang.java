package J07056;

import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String loai;
    private double dinhMuc;
    private double chiSoDau;
    private double chiSoCuoi;
    private double tienTrongDinhMuc;
    private double tienVuotDinhMuc;
    private double tongSoTien;

    public KhachHang(String ten, String inp) {
        ma = String.format("KH%02d", last_id++);
        this.ten = chuanHoa(ten);
        String[] token = inp.split("\\s+");
        loai = token[0];
        chiSoDau = Double.parseDouble(token[1]);
        chiSoCuoi = Double.parseDouble(token[2]);
        setDinhMuc();
        setTienTrongDinhMuc();
        setTienVuotDinhMuc();
        tongSoTien = (tienTrongDinhMuc + tienVuotDinhMuc + tienVuotDinhMuc * 0.05);
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

    private void setDinhMuc() {
        if (loai.equals("A")) {
            dinhMuc = 100;
        } else if (loai.equals("B")) {
            dinhMuc = 500;
        } else {
            dinhMuc = 200;
        }
    }

    private void setTienTrongDinhMuc() {
        double soDien = chiSoCuoi - chiSoDau;
        if (soDien <= dinhMuc) {
            tienTrongDinhMuc = soDien * 450;
        } else {
            tienTrongDinhMuc = dinhMuc * 450;
        }
    }

    private void setTienVuotDinhMuc() {
        double soDien = chiSoCuoi - chiSoDau;
        if (soDien > dinhMuc) {
            tienVuotDinhMuc = (soDien - dinhMuc) * 1000;
        } else {
            tienVuotDinhMuc = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f", ma, ten, tienTrongDinhMuc, tienVuotDinhMuc, tienVuotDinhMuc * 0.05, tongSoTien);
    }

    @Override
    public int compareTo(KhachHang o) {
        return tongSoTien > o.tongSoTien ? -1 : 1;
    }
}
