package ArraysProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sort012_Runner {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws NumberFormatException, IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] inputArr = new int[size];
		
		if(size == 0) {
			return inputArr;
		}
		
		String[] strNums = br.readLine().split("\\s");
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
			int [] arr = takeInput();
			Solution_Sort012.sort012(arr);
			printArray(arr);
			tc--;
		}
	}
}
