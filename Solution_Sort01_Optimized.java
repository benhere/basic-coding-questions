package ArraysProblems;

public class Solution_Sort01_Optimized {
	
	public static void sort01_Optimized(int[] arr) {
		int i=0;
		int j = arr.length-1;
		
		while(i<j) {
			if(arr[i] == 0) {
				i++;
				continue;
			}
			else {
				int x = arr[j];
				arr[j] = arr[i];
				arr[i] = x;
				j--;
			}
		}
	}
}
