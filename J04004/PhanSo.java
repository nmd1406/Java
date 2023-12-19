package J04004;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private static long gcd(long a, long b) {
        if(a == 0 || b == 0) {
            return a + b;
        }
        return gcd(b, a % b);
    }

    public void add(PhanSo p) {
        long bcnn = this.mauSo * p.mauSo / gcd(this.mauSo, p.mauSo);
        this.tuSo *= bcnn / this.mauSo;
        p.tuSo *= bcnn / p.mauSo;
        this.mauSo = bcnn;
        this.tuSo += p.tuSo;

        long ucln = gcd(this.tuSo, this.mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.tuSo, this.mauSo);
    }
}
