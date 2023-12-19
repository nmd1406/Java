package J01001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chieuDai = scanner.nextInt();
        int chieuRong = scanner.nextInt();

        if(chieuDai <= 0 || chieuRong <= 0) {
            System.out.println(0);
        } else {
            System.out.println(((chieuRong + chieuDai) * 2) + " " + (chieuDai * chieuRong));
        }
        
    }
}
