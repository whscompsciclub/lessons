import java.util.*;
import java.io.*;

public class usacoIO{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // FileNotFoundException works w/ files
        // IOException works w/ Input/Output

        // grab input from the file called "test.in"
        Scanner in = new Scanner(new File("test.in"));
        // output to the file called "test.out"
        PrintWriter out = new PrintWriter(new FileWriter("test.out"));

        String test = in.nextLine();
        int num = in.nextInt();

        out.println(test + num);
        
        // close the printwriter
        out.close();
    }
}