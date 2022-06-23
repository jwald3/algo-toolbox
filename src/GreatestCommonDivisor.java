import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int naiveGCD (int a, int b) {
        int divisor = 0;

        for (int i = 1; i <= (a + b); i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
        }

        return divisor;
    }

    public static long euclidGCD (long a, long b) {
        if (b == 0) {
            return a;
        }
        long aPrime = a % b;

        return euclidGCD(b, aPrime);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(euclidGCD(a, b));
    }
}
