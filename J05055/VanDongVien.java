package J05055;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class VanDongVien implements Comparable<VanDongVien> {
    private static int last_id = 1;
    private final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    private String ma;
    private String ten;
    private String dob;
    private Date startTime;
    private Date finishTime;
    private Date timeUuTien;
    private Date timeTaken;
    private Date finalTime;
    private int xepHang;

    public VanDongVien(String ten, String dob, String startTime, String finishTime) throws ParseException {
        ma = String.format("VDV%02d", last_id++);
        this.ten = ten;
        this.dob = dob;
        this.timeUuTien = formatter.parse(getTimeUuTien());
        this.startTime = formatter.parse(startTime);
        this.finishTime = formatter.parse(finishTime);
        this.timeTaken = calcTime(this.startTime, this.finishTime);
        this.finalTime = calcTime(this.timeUuTien, this.timeTaken);
    }

    private Date calcTime(Date start, Date end) throws ParseException {
        long seconds = (end.getTime() - start.getTime()) / 1000;
        return formatter.parse(String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60));
    }

    private int getAge() {
        int year = Integer.parseInt(dob.substring(6, 10));
        return 2021 - year;
    }

    private String getTimeUuTien() {
        int age = getAge();
        if (age >= 32) {
            return "00:00:03";
        } else if (age >= 25) {
            return "00:00:02";
        } else if (age >= 18) {
            return "00:00:01";
        }
        return "00:00:00";
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public int getXepHang() {
        return xepHang;
    }

    public Date getFinalTime() {
        return finalTime;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d", ma, ten, formatter.format(timeTaken), formatter.format(timeUuTien), formatter.format(finalTime), xepHang);
    }

    @Override
    public int compareTo(VanDongVien o) {
        return finalTime.compareTo(o.finalTime);
    }
}
