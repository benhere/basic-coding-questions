package ArraysProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sort01Runner {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws NumberFormatException, IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int inputArr[] = new int[size];
		
		if(size == 0) {
			return inputArr;
		}
		
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
		for(int i=0; i<size; i++) {
			inputArr[i] = Integer.parseInt(strNums[i]);
		}
		
		return inputArr;
	}
	
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int tc = Integer.parseInt(br.readLine().trim());
		
		while(tc>0) {
			int[] input = takeInput();
			//Solution_Sort01.sortZerosAndOne(input);
			Solution_Sort01_Optimized.sort01_Optimized(input);
			printArray(input);
			tc--;
		}
	}
}
