import java.util.*;

public class LCM {
    /*
    * The Least-Common Multiple (LCM) of two numbers is the lowest value that both numbers go into evenly.
    * The LCM can be found using the GCD, and because an effective GCD is known from a previous exercise, it will be used.
    * */
    public static int euclidGCD (int a, int b) {
        if (b == 0) {
            return a;
        }
        int aPrime = a % b;

        return euclidGCD(b, aPrime);
    }

    // number theory states that the GCD can be used to calculate LCM.
    public static int euclidLCM(int a, int b) {
        return (a * b) / euclidGCD(a, b);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(euclidLCM(a, b));
    }
}
