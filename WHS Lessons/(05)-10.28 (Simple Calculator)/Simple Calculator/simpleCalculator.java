import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());    // stores the amount of lines of input 
        // Start your code here
        double answer = 0.0;                        // stores answers (calculations) 
        for(int i = 0; i < n; i++){                 // iterate n times 
            String line = in.nextLine();            // grab the next line of input

            // create a String array called split containing 2 OR 3 elements 
            // from the input line split at spaces (" ")
            String split[] = line.split(" ");  

            // check if split is length 3, which would be format of (number operand number)
            // ex "1 + 1"
            if(split.length == 3){                  
                double first = Double.parseDouble(split[0]);    // grab the value of split[0] (first number)
                double second = Double.parseDouble(split[2]);   // grab the value of split[2] (second number)
                // note: split[1] is the operand
                if(split[1].equals("+")){               // addition
                    answer = first + second;
                }
                else if(split[1].equals("-")){          // subtraction
                    answer = first - second;
                }
                else if(split[1].equals("*")){          // multiplication
                    answer = first * second;
                }
                else if(split[1].equals("/")){          // division
                    answer = first / second;
                }
                System.out.println(answer);             // output the answer
            }
            // if split.length is 2 (no other option)
            else{
                double second = Double.parseDouble(split[1]);   // grab the only number 
                
                // answer currently contains the solution to the previous calculation
                // therefore we can use a compound assignment operator
                if(split[0].equals("+")){               // addition
                    answer += second;                   
                }
                else if(split[0].equals("-")){          // subtraction
                    answer -= second;
                }
                else if(split[0].equals("*")){          // multiplication
                    answer *= second;
                }
                else if(split[0].equals("/")){          // division 
                    answer /= second;
                }
                System.out.println(answer);             // output the answer
                //end of loop
            }
        }
    }
}