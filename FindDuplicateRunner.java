package ArraysProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindDuplicateRunner {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int [] takeInput() throws NumberFormatException, IOException {
		int size = Integer.parseInt(br.readLine().trim());
		
		int[] input = new int[size];
		
		if(size == 0) {
			return input;
		}
		
		String[] strNums = br.readLine().split("\\s");
		
		for(int i=0; i<size; i++) {
			input[i] = Integer.parseInt(strNums[i]);
		}
		
		return input;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int tc = Integer.parseInt(br.readLine().trim());
		
		while(tc>0) {
			int [] arr = takeInput();
			System.out.println(FindDuplicateOptimized.findDuplicate(arr));
			//System.out.println(Solution_findDuplicate.findDuplicate(arr));
			tc--;
		}
	}
}
