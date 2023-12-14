package ArraysProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EquilibriumNumberRunner {
	
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
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int tc = Integer.parseInt(br.readLine().trim());
		
		while(tc>0) {
			int[] arr = takeInput();
			// int ans =  Solution_EquilibriumNumberInArray.findEqulibriumNumber(arr, arr.length);
			// int ans =  Solution_EquilibriumNumberOptimized.findEquilibriumNumber(arr, arr.length);
			int ans = Solution_EquilobriumPointSpaceOptimized.findEquilibriumPoint(arr, arr.length);
			System.out.println(ans);
			tc--;
		}
	}
}
