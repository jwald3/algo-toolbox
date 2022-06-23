public class FibonacciNumbers {

    public static int fibRecurs(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibRecurs(n - 1) + fibRecurs(n - 2);
        }
    }

    public static long fibList(int n) {
        long[] numList = new long[n + 1];
        numList[0] = 0;
        numList[1] = 1;

        for (int i = 2; i <= n; i++) {
            numList[i] = numList[i - 1] + numList[i - 2];
        }

        return numList[n];
    }


    public static void main(String[] args) {
        // utilizing a recursive formula is slow because of repeat calculations
        // System.out.println(fibRecurs(7));

        // using the list-based formula reduces computation time by storing values in a collection
        System.out.println(fibList(100));
    }
}
