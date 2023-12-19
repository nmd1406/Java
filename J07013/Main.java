package J07013;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> sinhVienArrayList = (ArrayList<SinhVien>) objectInputStream.readObject();
        sinhVienArrayList.forEach(System.out::println);
    }
}
