package J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class User implements Comparable<User> {
    private String ma;
    private String ten;
    private Date date1;
    private Date date2;

    public User(String ma, String ten, String date1, String date2) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        this.date1 = dateFormat.parse(date1);
        this.date2 = dateFormat.parse(date2);
    }

    private int getHour() {
        return (int) TimeUnit.MILLISECONDS.toHours(date2.getTime() - date1.getTime());
    }

    private int getMinute() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(date2.getTime() - date1.getTime()) - getHour() * 60;
    }

    @Override
    public int compareTo(User o) {
        if (getHour() == o.getHour()) {
            return o.getMinute() - getMinute();
        }
        return o.getHour() - getHour();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d gio %d phut", ma, ten, getHour(), getMinute());
    }
}
