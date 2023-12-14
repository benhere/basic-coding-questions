package ArraysProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayIntersectionRunner {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws NumberFormatException, IOException {
		int size = Integer.parseInt(br.readLine().trim());
		
		int [] inputArr = new int[size];
		
		if(size == 0) {
			return inputArr;
		}
		String[] strNums = br.readLine().split("\\s");
		
		for(int i=0; i<size; i++) {
			inputArr[i] = Integer.parseInt(strNums[i]);
		}
			
		return inputArr;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int tc = Integer.parseInt(br.readLine().trim());
		
		while(tc>0) {
			int[] arr1 = takeInput();
			int[] arr2 = takeInput();			
			Solution_ArrayIntersection.findArrayIntersection(arr1, arr2);
			System.out.println();
			tc--;
		}
	}
}
