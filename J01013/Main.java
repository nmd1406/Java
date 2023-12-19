package J01013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] prime = new int[2000005];
        prime[0] = prime[1] = 1;
        for(int i = 2; i <= Math.sqrt(2000000); ++i) {
            if(prime[i] == 0) {
                for(int j = i * i; j <= 2000000; j += i) {
                    if(prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }

        for(int i = 2; i <= 2000000; ++i) {
            if(prime[i] == 0) {
                prime[i] = i;
            }
        }

        long sum = 0;
        int test = scanner.nextInt();
        while (test-- > 0) {
            int num = scanner.nextInt();

            while (num > 1) {
                sum += prime[num];
                num /= prime[num];
            }
        }

        System.out.println(sum);
    }
}
