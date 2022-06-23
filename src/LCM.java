import java.util.*;

public class LCM {
    /*
    * The Least-Common Multiple (LCM) of two numbers is the lowest value that both numbers go into evenly.
    * The LCM can be found using the GCD, and because an effective GCD is known from a previous exercise, it will be used.
    * */
    public static long euclidGCD (long a, long b) {
        if (b == 0) {
            return a;
        }
        long aPrime = a % b;

        return euclidGCD(b, aPrime);
    }

    // number theory states that the GCD can be used to calculate LCM.
    public static long euclidLCM(long a, long b) {
        return (a * b) / euclidGCD(a, b);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.println(euclidLCM(a, b));
    }
}
