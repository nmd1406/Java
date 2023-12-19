package J03004;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = Integer.parseInt(scanner.nextLine());

        while (test-- > 0) {
            String str = scanner.nextLine();

            System.out.println(chuanHoa(str));
        }
    }

    public static String chuanHoa(String str) {
        StringTokenizer tokens = new StringTokenizer(str);
        StringBuilder newStr = new StringBuilder();
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            newStr.append(Character.toUpperCase(token.charAt(0)));

            for(int i = 1; i < token.length(); ++i) {
                newStr.append(Character.toLowerCase(token.charAt(i)));
            }

            newStr.append(" ");
        }

        return newStr.toString();
    }
}
