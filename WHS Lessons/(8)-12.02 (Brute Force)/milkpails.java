import java.io.*;
import java.util.*;

public class milkpails {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("pails.in"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        br.close();
        int total = 0;
        int max = 0;
        
        int count=0;
                
        while(total+y<=m) {
            count++;
            total+=y;
        }
        
        max=total;
        
        while(count>=0) {
            while(total+x<=m) {
                total+=x;
                max=Math.max(total, max);
            }
            total-=y;
            count--;
        }
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));
        pw.println(max);
        pw.close();
    }
}