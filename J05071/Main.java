package J05071;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        Map<String, ThanhPho> thanhPhoMap = new HashMap<>();
        while (test-- > 0) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            int giaCuoc = Integer.parseInt(scanner.nextLine());
            thanhPhoMap.putIfAbsent(ma, new ThanhPho(ma, ten, giaCuoc));
        }

        test = Integer.parseInt(scanner.nextLine());
        List<CuocGoi> cuocGoiList = new ArrayList<>();
        while (test-- > 0) {
            String[] inp = scanner.nextLine().split(" ");
            if (!inp[0].startsWith("0")) {
                cuocGoiList.add(new CuocGoi(new ThanhPho("0", "Noi mang", 800), inp[0], inp[1], inp[2]));
            } else {
                cuocGoiList.add(new CuocGoi(thanhPhoMap.get(inp[0].substring(1, 3)), inp[0], inp[1], inp[2]));
            }
        }
        cuocGoiList.forEach(System.out::println);
    }
}

/*
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
 */