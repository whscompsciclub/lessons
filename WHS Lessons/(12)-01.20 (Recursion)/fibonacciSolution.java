import java.util.*;
import java.io.*;

public class fibonacciSolution {
    
    // a fibonacci num of n is sum of the (fibonacci num of n-1) & (fibonacci num of n-2)
    // a fibonacci num of n-1 is the sum of the (fibonacci num of (n-1)-1 ) & (fibonacci num of (n-1)-2 )
    // and so on, until you reach 0 or 1
    public static int fibonacci(int n){
        // 2 base cases
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        // recursive calls
        System.out.printf("computing fibonacci(%d)\n", n);    // prints which fibonacci value we're computing 
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        /* DO NOT EDIT CODE BELOW */
      	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
