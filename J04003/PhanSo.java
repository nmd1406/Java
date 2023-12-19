package J04003;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        long ucln = gcd(tuSo, mauSo);
        this.tuSo = tuSo / ucln;
        this.mauSo = mauSo / ucln;
    }

    private long gcd(long a, long b) {
        if(a == 0 || b == 0) {
            return a + b;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.tuSo, this.mauSo);
    }
}
