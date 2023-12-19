package J03009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            List<String> list1 = Arrays.asList(str1.split("\\s+"));
            List<String> list2 = Arrays.asList(str2.split("\\s+"));
            Set<String> set = new HashSet<>();

            for(String str : list1) {
                if(!list2.contains(str)) {
                    set.add(str);
                }
            }
            for(String str : set) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
