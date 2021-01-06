import java.util.*;
public class twoDArrays {
    public static void main(String[] args){
        // creates an empty 4 by 2 2d array
        // think about it as a table, rows by columns
        // 0 0 
        // 0 0
        // 0 0
        // 0 0 
        int brr[] = new int[5];
        int arr[][] = new int[4][2];

        for(int i = 0; i < arr.length; i++){            // arr.length = # of rows
            for(int j = 0; j < arr[i].length; j++){     // arr[i].length = # of columns
                System.out.print(arr[i][j] + " ");      // prints the element and a space
            }
            System.out.println();                       // creates a new line for the next row
        }

        Scanner in = new Scanner(System.in);
        String tictactoe[][] = { {"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        int player = 0;
        while(true){
            System.out.println();
            System.out.println("   1 2 3");
            for(int i = 0; i < 3; i++){
                if(i == 0){
                    System.out.print("A: ");
                }
                else if(i == 1){
                    System.out.print("B: ");
                }
                else{
                    System.out.print("C: ");
                }
                for(int j = 0; j < 3; j++){
                    System.out.print(tictactoe[i][j] + " ");
                }
                System.out.println();
            }

            if((tictactoe[0][0].equals(tictactoe[0][1]) && tictactoe[0][1].equals(tictactoe[0][2]) && !tictactoe[0][0].equals("-"))
            || (tictactoe[1][0].equals(tictactoe[1][1]) && tictactoe[1][1].equals(tictactoe[1][2]) && !tictactoe[1][0].equals("-"))
            || (tictactoe[2][0].equals(tictactoe[2][1]) && tictactoe[2][1].equals(tictactoe[2][2]) && !tictactoe[2][0].equals("-"))
            || (tictactoe[0][0].equals(tictactoe[1][0]) && tictactoe[1][0].equals(tictactoe[2][0]) && !tictactoe[0][0].equals("-"))
            || (tictactoe[0][1].equals(tictactoe[1][1]) && tictactoe[1][1].equals(tictactoe[2][1]) && !tictactoe[0][1].equals("-"))
            || (tictactoe[0][2].equals(tictactoe[1][2]) && tictactoe[1][2].equals(tictactoe[2][2]) && !tictactoe[0][2].equals("-"))
            || (tictactoe[0][0].equals(tictactoe[1][1]) && tictactoe[1][1].equals(tictactoe[2][2]) && !tictactoe[1][1].equals("-"))
            || (tictactoe[0][2].equals(tictactoe[1][1]) && tictactoe[1][1].equals(tictactoe[2][0]) && !tictactoe[1][1].equals("-"))
            ){
                if(player%2 == 1){
                    System.out.println("Player 1 WINS!!!");
                }
                else{
                    System.out.println("Player 2 WINS!!!");
                }
                break;
            }

            if(player%2 == 0){
                System.out.println("It's your turn Player 1: ");
            }
            else{
                System.out.println("It's your turn Player 2: ");
            }
            System.out.println();
            String input = in.next();
            String row = input.substring(0, 1);
            int rownum = 0;
            String column = input.substring(1, 2);
            int columnnum = Integer.parseInt(column) - 1;
            if(row.equals("A")){
                rownum = 0;
            }
            else if(row.equals("B")){
                rownum = 1;
            }
            else{
                rownum = 2;
            }
            if(player%2 == 0){
                tictactoe[rownum][columnnum] = "X";
            }
            else{
                tictactoe[rownum][columnnum] = "O";
            }
            player++;
        }
    }
}
