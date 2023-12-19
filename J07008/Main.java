package J07008;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] arr;
    static List<String> res = new ArrayList<>();
    static List<Integer> daySo = new ArrayList<>();

    public static void backTrack(int i) {
        if (daySo.size() > 1) {
            String str = "";
            for (int num : daySo) {
                str += num + " ";
            }
            res.add(str);
        }

        for (int j = i; j < n; ++j) {
            if (daySo.isEmpty() || arr[j] > daySo.get(daySo.size() - 1)) {
                daySo.add(arr[j]);
                backTrack(j + 1);
                daySo.remove(daySo.size() - 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DAYSO.in"));

        while (scanner.hasNext()) {
            n = scanner.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
            }
        }

        backTrack(0);
        res.sort(Comparator.naturalOrder());
        for(String str : res) {
            System.out.println(str);
        }
    }
}
