public class isEachEven{
    public static void main(String []args){
        // declare and intialize an empty array of length 10 
        int myArray[] = new int[10];
      	myArray[0] = 1;     // set element 0 to 1
      	myArray[1] = 1;     // set element 1 to 1
        
        // loop through index 2-9 to create a fibonacci sequence
        for(int i = 2; i < 10; i++){
            myArray[i] = myArray[i-1] + myArray[i-2];
        }
        
        // loop to print the number and if it's odd or even
        int counter = 0;                            
        while(counter < 10){                        
            if(myArray[counter] % 2 == 0){          // check if even or odd with %2
                System.out.println(myArray[counter] + " even");
            }
            else{
                System.out.println(myArray[counter] + " odd");
            }
            counter++;                              // increment counter 
        }
    }
}