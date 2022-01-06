import java.util.*;
import java.io.*;

public class factorialSolution{

    // a factorial of n can be thought of as n * (n-1)!
    // a factorial of (n-1) can be thought of as (n-1) * (n-2)!
    // and so on, until (n-1) == 0, because 0! = 1
    public static int factorial(int n){
        // base case
        if(n == 0){
            return 1;
        }

        // recursive calls
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        /* DO NOT EDIT CODE BELOW */
        Scanner in = new Scanner(System.in);
        System.out.println(factorial(in.nextInt()));
    }
}