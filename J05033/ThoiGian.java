package J05033;

public class ThoiGian implements Comparable<ThoiGian> {
    private int gio;
    private int phut;
    private int giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(ThoiGian o) {
        if(gio != o.gio) {
            return gio - o.gio;
        }
        if(phut != o.phut) {
            return phut - o.phut;
        }
        return giay - o.giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}
