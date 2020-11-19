import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // store n, the highest integer value in the full array
        int n = in.nextInt();

        // formula for the sum of a sequence (algebra stuff!)
        int sum = n * (n + 1) / 2;

        // loop through each element in the given array
        // note the condition (i < n-1), there is 1 missing number and the size of the array is n-1
        for(int i = 0; i < n-1; i++){
            // subtract each number from sum
            sum -= in.nextInt();
        }

        // the missing number should be left as the value of sum
        System.out.println(sum);        
    }
}
