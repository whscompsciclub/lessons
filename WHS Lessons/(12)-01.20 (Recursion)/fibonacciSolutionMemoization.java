import java.util.*;
import java.io.*;

public class fibonacciSolutionMemoization {
    
    // a fibonacci num of n is sum of the (fibonacci num of n-1) & (fibonacci num of n-2)
    // a fibonacci num of n-1 is the sum of the (fibonacci num of (n-1)-1 ) & (fibonacci num of (n-1)-2 )
    // and so on, until you reach 0 or 1

    // using memoization:
    // when recursing, we're actually calculating the same value multiple times, wasting space & time
    // to see a visual of the fibonacci sequence with and without memoization, visit https://recursion.now.sh/  
    // and choose fibonacci from the "Pre-defined templates", then run fn(5) with "Enable memoization" off
    // then run fn(5) again but with "Enable memoization" on
    // you should notice that with "Enable memoization" on there are no repetitions and the function is faster
    
    
    // initialize a HashMap which stores keys and values that correspond to the keys (rough explanation)
    public static Map<Integer, Integer> memo = new HashMap<>();
    
    public static int fibonacci(int n){
        // 2 base cases
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        // if the HashMap contains the key n already, return the value stored w/ the key
        if(memo.containsKey(n)){
            System.out.printf("grabbing memo[%d]\n", n);        // prints which memo value we're grabbing 
            return memo.get(n);                                 // grab the value
        }

        // recursive calls
        System.out.printf("computing fibonacci(%d)\n", n);  // prints which fibonacci value we're computing 
        int result = fibonacci(n-1) + fibonacci(n-2);       // compute the fibonacci value (using recursion) and store it into result
    
        memo.put(n, result);                                // store the value result with the key n
        return result;                                      // return result
    }

    public static void main(String[] args) {
        /* DO NOT EDIT CODE BELOW */
      	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
