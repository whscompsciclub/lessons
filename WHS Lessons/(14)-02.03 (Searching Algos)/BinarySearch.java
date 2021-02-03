import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("src/textarr.in"));
		int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int target = 7975348;
		int begin = 0;
		int end = arr.length-1;
		
		long start = System.nanoTime();
		int count = 0;
		
		while(end>=begin) {
			count++;
			int mid = (begin + end)/2;
			System.out.println("Checking: " + arr[mid]);
			if(arr[mid] == target) {
				System.out.println();
				System.out.println(String.format("Indext at: %,d", mid));
				System.out.println(String.format("Iterations taking: %,d", count));
				break;
			} else if(arr[mid] > target) {
				end = mid - 1;
			} else {
				begin = mid + 1;
			}
		}
		
		long finish = System.nanoTime();
		System.out.println(String.format("Time taken: %,d", (finish-start)));
	}
	
}
