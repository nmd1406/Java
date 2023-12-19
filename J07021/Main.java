package J07021;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DATA.in"));

        String str = "";
        while (true) {
            str = scanner.nextLine();
            if (str.equals("END")) {
                break;
            }
            System.out.println(chuanHoa(str));
        }
    }

    public static String chuanHoa(String str) {
        StringBuilder res = new StringBuilder();
        StringTokenizer tokens = new StringTokenizer(str);

        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            res.append(Character.toUpperCase(token.charAt(0)));
            for (int i = 1; i < token.length(); ++i) {
                res.append(Character.toLowerCase(token.charAt(i)));
            }

            res.append(" ");
        }

        return res.toString();
    }
}
