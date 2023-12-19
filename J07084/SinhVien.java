package J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SinhVien implements Comparable<SinhVien> {
    private String ten;
    private Date start;
    private Date end;
    private long time;

    public SinhVien(String ten, String start, String end) throws ParseException {
        this.ten = ten;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.start = dateFormat.parse(start);
        this.end = dateFormat.parse(end);
        time = TimeUnit.MILLISECONDS.toMinutes(this.end.getTime() - this.start.getTime());
    }

    @Override
    public String toString() {
        return String.format("%s %d", ten, time);
    }

    @Override
    public int compareTo(SinhVien o) {
        if (time == o.time) {
            return ten.compareTo(o.ten);
        }
        return (int) (o.time - time);
    }
}
