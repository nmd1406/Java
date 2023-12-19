package J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang> {
    private static int last_id = 1;
    private String ma;
    private String ten;
    private String soPhong;
    private Date ngayNhan;
    private Date ngayTra;
    private int tienDichVu;

    public KhachHang(String ten, String soPhong, String ngayNhan, String ngayTra, int tienDichVu) throws ParseException {
        ma = String.format("KH%02d", last_id++);
        this.ten = chuanHoa(ten);
        this.soPhong = soPhong;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayNhan = format.parse(ngayNhan);
        this.ngayTra = format.parse(ngayTra);
        this.tienDichVu = tienDichVu;
    }

    private String chuanHoa(String ten) {
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(ten);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            stringBuilder.append(Character.toUpperCase(token.charAt(0)));
            stringBuilder.append(token.substring(1).toLowerCase());
            stringBuilder.append(" ");
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    private long soNgayO() {
        return (ngayTra.getTime() - ngayNhan.getTime()) / (24 * 60 * 60 * 1000) + 1;
    }

    private int thanhTien() {
        int tang = Integer.parseInt(soPhong.substring(0, 1));
        int[] arr = new int[]{25, 34, 50, 80};

        return arr[tang - 1] * (int)soNgayO() + tienDichVu;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", ma, ten, soPhong, soNgayO(), thanhTien());
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.thanhTien() - thanhTien();
    }
}
