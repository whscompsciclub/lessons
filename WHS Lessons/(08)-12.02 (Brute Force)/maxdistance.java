import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maxdistance {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
    	// Start your code here
        
        // create two arrays to store x and y coords
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            y[i] = in.nextInt();
        }
        

        int max = 0;
        for(int i = 0; i < n; i++){
            // there's no need to check 'backwards'
            // so we can set j to i+1
            for(int j = i+1; j < n; j++){    
                // x2-x1
                int dx = x[i] - x[j];
                // y2 -y1
                int dy = y[i] - y[j];
                // check whether the curr distance (dx * dx + dy * dy) is greater than max
                // set max to whichever is greater
                max = Math.max(max, dx*dx + dy*dy);
            }
        }
        // print max, which is the answer.
        System.out.println(max);
    }
}
