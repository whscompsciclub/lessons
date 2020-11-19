import java.util.*;
public class Arrays{
    public static void main(String[] args){
        // 1d arrays
        int arr[] = {1, 3, 5, 6, 2, 8, 2};
        
        // iterating and max, min, sum
        // we want to check if the value is GREATER than another value, which is why we start at MIN_VALUE
        int max = Integer.MIN_VALUE; // -2147483647     
        // same as above but opposite, we're checking if it's SMALLER 
        int min = Integer.MAX_VALUE; // 2147483647
        // to calculate the sum
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            // Math.max(max, arr[i])

            if (arr[i] < min) {
                min = arr[i];
            }
            // Math.min(min, arr[i])
            
            // add the element to sum
            sum += arr[i];
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);

        // arraylists
        ArrayList<String> names = new ArrayList<String>();  // creates an empty string arraylist

        // use .add(value) to add elements
        names.add("bob");
        names.add("joey");
        // use .get(index) to grab elements
        System.out.println(names.get(0));
        // remove elements
        names.remove(1);
        names.add("alice");
        System.out.println(names.get(1));
        // use .indexOf(value) to grab the index of an element (starts at 0)
        System.out.println(names.indexOf("bob"));
        
        // displays the ArrayList size, similar to Arrays.length; 
        System.out.println(names.size());

        // looping the arraylist
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        
    }
}
