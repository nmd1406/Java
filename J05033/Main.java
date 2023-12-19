package J05033;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        ArrayList<ThoiGian> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new ThoiGian(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(list);

        for(ThoiGian ele : list) {
            System.out.println(ele);
        }
    }
}
