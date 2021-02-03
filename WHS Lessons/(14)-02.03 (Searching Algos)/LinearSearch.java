import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("textarr.in"));
		int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int target = 7975348;
		
		int count = 0;
		long start = System.nanoTime();
		for(int i=0; i<arr.length; i++) {
			count++;
			System.out.println("Checking: " + arr[i]);
			if(arr[i] == target) {
				System.out.println();
				System.out.println(String.format("Indext at: %,d", i));
				System.out.println(String.format("Iterations taking: %,d", count));
				break;
			}
		}
		
		long finish = System.nanoTime();
		System.out.println(String.format("Time taken: %,d", (finish-start)));
	}

}
