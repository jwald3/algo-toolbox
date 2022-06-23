import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int[] num_sequence = new int[n + 1];
        num_sequence[0] = 0;
        num_sequence[1] = 1;

        for (int i = 2; i <= n; i++) {
            num_sequence[i] = (num_sequence[i - 1] + num_sequence[i - 2]) % 10;
        }

        return num_sequence[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}