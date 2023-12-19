package J05075;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            list.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        for (int i = 0; i < n; ++i) {
            String[] inp = scanner.nextLine().split(" ");
            SinhVien sinhVien = list.get(list.indexOf(new SinhVien(inp[0])));
            sinhVien.setDiemChuyenCan(inp[1]);
        }

        String query = scanner.nextLine();
        list.forEach(sinhVien -> {
            if (sinhVien.getLop().equals(query)) {
                System.out.println(sinhVien);
            }
        });
//        set.forEach(System.out::println);
    }
}

/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
D19CQAT02-B
 */