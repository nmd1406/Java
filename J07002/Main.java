package J07002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(new File("C:\\Users\\Admin\\OneDrive - vn.edu.ptit.edu.vn\\Java\\src\\J07002\\Data.txt"));
            long sum = 0;
            while (scanner.hasNext()) {
                try {
                    int x = Integer.parseInt(scanner.next());
                    sum += x;
                } catch (NumberFormatException exception) {

                }
            }
            System.out.println(sum);
            scanner.close();

    }
}
