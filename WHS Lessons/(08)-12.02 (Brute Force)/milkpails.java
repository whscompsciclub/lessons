import java.io.*;
import java.util.*;

public class milkpails {
    public static void main(String[] args) throws IOException {
        
        //Getting values from USACO
        BufferedReader br = new BufferedReader(new FileReader("pails.in"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        br.close();
        
        //Variable setup
        //total is the total milk in bucket m
        int total = 0;
        //max is the maximum amount of milk put in bucket m
        int max = 0;
        //count is the number of bucket y used to fill bucket m
        int count=0;
                
        //Fill bucket m using only bucket y until it is at maximum capacity but not overflowing
        //Also record the number of bucket y used
        while(total+y<=m) {
            count++;
            total+=y;
        }
        
        //Set max to the current maximum value
        max=total;
        
        //Take out 1 unit of bucket y and fill to maximum with bucket x
        //If this new amount of milk in bucket m is greater than max, replace max with current value
        //Repeat as long as there is a bucket y of milk to take out
        while(count>=0) {
            while(total+x<=m) {
                total+=x;
                max=Math.max(total, max);
            }
            total-=y;
            count--;
        }
        
        //Output solution to USACO
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));
        pw.println(max);
        pw.close();
    }
}
