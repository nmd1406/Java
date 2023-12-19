package J03010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] emails = new String[50];
        int test = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < test; ++i) {
            String str = scanner.nextLine().trim().toLowerCase();
            String res = email(str);
            emails[i] = res;
        }

        for(int i = 0; i < test - 1; ++i) {
            int count = 1;
            for(int j = i + 1; j < test; ++j) {
                if(emails[i].equals(emails[j])) {
                    ++count;
                    emails[j] += count;
                }
            }
        }

        for(int i = 0; i < test; ++i) {
            System.out.println(emails[i] + "@vn.edu.ptit.edu.vn");
        }
    }

    public static String email(String str) {
        String[] s = str.split("\\s+");
        StringBuilder newStr = new StringBuilder();
        newStr.append(s[s.length - 1]);
        for(int i = 0; i < s.length - 1; ++i) {
            newStr.append(s[i].charAt(0));
        }
        return newStr.toString();
    }
}
