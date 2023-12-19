package J05026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        List<GiangVien> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new GiangVien(scanner.nextLine(), scanner.nextLine()));
        }
        int q = Integer.parseInt(scanner.nextLine());
        while (q-- > 0) {
            String query = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(query);
            StringBuilder builder = new StringBuilder();
            while (tokenizer.hasMoreTokens()) {
                builder.append(tokenizer.nextToken().substring(0, 1).toUpperCase());
            }
            query = builder.toString();

            System.out.println("DANH SACH GIANG VIEN BO MON " + query + ":");
            for (GiangVien giangVien : list) {
                if (query.equals(giangVien.getMon())) {
                    System.out.println(giangVien);
                }
            }
        }
    }
}
