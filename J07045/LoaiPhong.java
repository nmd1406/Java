package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private char kiHieu;
    private String ten;
    private int donGia;
    private double phiPhucVu;

    public LoaiPhong(String inp) {
        String[] str = inp.split(" ");
        this.kiHieu = str[0].charAt(0);
        this.ten = str[1];
        this.donGia = Integer.parseInt(str[2]);
        this.phiPhucVu = Double.parseDouble(str[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return String.format("%c %s %d %.2f", kiHieu, ten, donGia, phiPhucVu);
    }
}
