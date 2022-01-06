import java.util.*;
public class MultipleMissingNumbers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // store n, the highest integer value in the full array
        int n = in.nextInt();
        
        // create an empty ArrayList b/c we don't know how many integers are going to be given
        // an ArrayList has a flexible length, unlike an Array
        ArrayList<Integer> input = new ArrayList<Integer>();

        // in.hasNextInt() returns true if there is another integer in the input
        // returns false if there isn't another integer in the input
        // useful when you do not know the exact number of integers  
        while(in.hasNextInt()){
            input.add(in.nextInt());
        }
        
        // loop through all numbers from 1 to n
        for(int i = 0; i < n; i++){
            // check if the number exists in the ArrayList
            // indexOf() returns -1 if the value is not in the ArrayList
            if(input.indexOf(i + 1) == -1){
                // print out the missing numbers with a space after
                System.out.print(i + 1 + " ");
            }
        }
    }
}