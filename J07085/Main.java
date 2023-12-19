package J07085;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) objectInputStream.readObject();
        for (String string : list) {
            int sum = 0;
            String num = "";
            for (int i = 0; i < string.length(); ++i) {
                if (Character.isDigit(string.charAt(i))) {
                    if (num.isEmpty() && string.charAt(i) == '0') {
                        continue;
                    }
                    num += string.charAt(i);
                    sum += (string.charAt(i) - '0');
                }
            }
            System.out.println(num + " " + sum);
        }
    }
}
