import java.util.*;
public class MissingNumber2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // store n, the highest integer value in the full array
        int n = in.nextInt();

        // create a new empty array of length n-1
        int[] arr = new int[n-1];

        // loop through and fill in the array
        for(int i = 0; i < n-1; i++){
            arr[i] = in.nextInt();
        }

        // sort the array (smallest to greatest)
        Arrays.sort(arr);

        // loop through each element in the given array
        for(int i = 0; i < arr.length; i++){
            // because the array is sorted, the digits should be something like
            // 1 2 3 ... 
            if(arr[i] != i+1){
                // if the element isnt equal to i+1, then it's the missing number
                System.out.println(i+1);
                // break statements end the loop, after this break statement
                // the program jumps OUT of the for loop
                break;
            }
            
            // there is 1 special case where the missing number is n, or at the very end of the array
            // if i == arr.length - 1, then we have reached the end of the sorted array w/o finding the missing number
            // therefore the missing number must be i + 2 
            if(i == arr.length - 1){
                System.out.println(i+2);
            }
        }
    }
}


