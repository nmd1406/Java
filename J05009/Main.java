package J05009;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new ThiSinh(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }
        list.sort(null);
        double max = list.get(0).getTongDiem();
        list.forEach(thiSinh -> {
            if(thiSinh.getTongDiem() == max) {
                System.out.println(thiSinh);
            }
        });
    }
}
