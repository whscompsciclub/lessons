import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
      // Set up scanner and grab the basic input (pre-made setup already)
      Scanner scanner = new Scanner(System.in);
      String temp = scanner.nextLine();
      int a[] = new int[temp.length()];
      for(int i = 0; i < temp.length(); i++){
         a[i] = temp.charAt(i) - '0';
      }

      // Start your code here
      String num = "";              // to output the number at the end
      Boolean palindrome = true;    // to determine if it is or it isnt a palindrome
      
      // loop through all digits
      for(int i = 0; i < temp.length(); i++){
        num += a[i];                // append or concatenate the digit
        
        // checks if the digit from the front is NOT equal to the digit from the back  
        if(a[i] != a[temp.length() - i -1]){        
          palindrome = false;       // set palindrom (boolean) to false
        }
      }
      
      // output results
      if(palindrome){               
        System.out.println(num + " is a palindrome");
      }
      else{
        System.out.println(num + " is not a palindrome");
      }

	}
}
