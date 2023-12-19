package J05072;

public class CuocGoi implements Comparable<CuocGoi> {
    private ThanhPho thanhPho;
    private String thueBao;
    private String timeStart;
    private String timeEnd;
    private int phut;

    public CuocGoi(ThanhPho thanhPho, String thueBao, String timeStart, String timeEnd) {
        this.thanhPho = thanhPho;
        this.thueBao = thueBao;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        phut = getMinutes();
    }

    private int getMinutes() {
        String[] s1 = timeStart.split(":");
        String[] s2 = timeEnd.split(":");
        int temp = (Integer.parseInt(s2[0]) - Integer.parseInt(s1[0])) * 60 + (Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]));
        return thanhPho.getTen().equals("Noi mang") ? (int) Math.round(temp / 3.0) : temp;
    }

    private int calcGiaCuoc() {
        return thanhPho.getGiaCuoc() * phut;
    }

    @Override
    public int compareTo(CuocGoi o) {
        return o.calcGiaCuoc() - calcGiaCuoc();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", thueBao, thanhPho, phut, calcGiaCuoc());
    }
}
