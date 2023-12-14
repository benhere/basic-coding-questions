package ArraysProblems;

public class Solution_EquilibriumNumberOptimized {
	
	public static int findEquilibriumNumber(int[] arr, int n) {
		
		// find prefix sum of array elements
		int[] prefixArr = new int[n];
		prefixArr[0] = arr[0];
		for(int i=1; i<n; i++) {
			prefixArr[i] = prefixArr[i-1] + arr[i]; 
		}
		
		// find suffix sum of array elements
		int[] suffixArr = new int[n];
		suffixArr[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			suffixArr[i] = suffixArr[i+1] + arr[i];
		}
		
		// find the point where prefix and suffix sum are equal
		for(int i=1; i<n-1; i++) {
			if(prefixArr[i] == suffixArr[i]) {
				return arr[i];
			}
		}
		return -1;
	}
}
