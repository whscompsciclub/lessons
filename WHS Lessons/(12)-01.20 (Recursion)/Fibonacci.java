import java.util.Scanner;

/*
 * Goal: create a function that returns
 * the n-th number in the Fibonacci sequence
 * 0, 1, 1, 2, 3, 5, 8, ...
 * https://visualgo.net/en/recursion?slide=1
 **/

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
        System.out.println(fib_nr(n));
        in.close(); // optional
    }

    public static int fib(int n) {
        if (n == 1) return 0;
        if (n <= 3) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib_nr(int n) {
        if (n == 1) return 0;
        if (n <= 3) return 1;
        int a = 0, b = 1, temp;
        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
