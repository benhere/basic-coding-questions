package ArraysProblems;

public class Solution_EquilobriumPointSpaceOptimized {
	
	public static int findEquilibriumPoint(int[] arr, int n) {
		
		int totalSum = 0;
		int rSum = 0;
		
		for(int i = 0; i<n; i++) {
			totalSum += arr[i];
		}
		
		for(int i=0; i<n; i++) {
			if(rSum == (totalSum-arr[i]-rSum)) {
				return arr[i];
			}
			rSum += arr[i];
		}
		return -1;
	}

}
