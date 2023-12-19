package J06008;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GiangVien {
    private String ma;
    private String ten;
    private List<MonHoc> monHocList = new ArrayList<>();
    private double totalTime = 0;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten.substring(1);
    }

    public GiangVien(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public List<MonHoc> getMonHocList() {
        return monHocList;
    }

    public void addTime(double time) {
        totalTime += time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiangVien giangVien = (GiangVien) o;
        return Objects.equals(getMa(), giangVien.getMa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMa());
    }

    public void addMonHoc(MonHoc monHoc) {
        this.monHocList.add(monHoc);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        monHocList.forEach(monHoc -> output.append(monHoc).append("\n"));
        String str = String.format("Tong: %.2f", totalTime);
        output.append(str);
        return output.toString();
    }
}
