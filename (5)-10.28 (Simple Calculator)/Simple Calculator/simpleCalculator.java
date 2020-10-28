import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        double answer = 0.0;
        for(int i = 0; i < n; i++){
            String line = in.nextLine();
            String split[] = line.split(" ");
            if(split.length == 3){
                double first = Double.parseDouble(split[0]);
                double second = Double.parseDouble(split[2]);
                if(split[1].equals("+")){
                    answer = first + second;
                }
                else if(split[1].equals("-")){
                    answer = first - second;
                }
                else if(split[1].equals("*")){
                    answer = first * second;
                }
                else if(split[1].equals("/")){
                    answer = first / second;
                }
                System.out.println(answer);
            }
            else{
                double second = Double.parseDouble(split[1]);
                if(split[0].equals("+")){
                    answer += second;
                }
                else if(split[0].equals("-")){
                    answer -= second;
                }
                else if(split[0].equals("*")){
                    answer *= second;
                }
                else if(split[0].equals("/")){
                    answer /= second;
                }
                System.out.println(answer);
            }
        }
    }
}