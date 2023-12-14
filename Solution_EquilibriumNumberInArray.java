// Time Complexity - O(2^n)
package ArraysProblems;

public class Solution_EquilibriumNumberInArray {
	
	public static int findEqulibriumNumber(int[] arr, int n) {
		
		for(int i=1; i<n; i++) {
			
			int leftSum = 0;
			for(int j=i-1; j>=0; j--) {
				leftSum += arr[j];
			}
			
			int rightSum = 0;
			for(int k=i+1; k<n; k++) {
				rightSum += arr[k];
			}
			
			if(leftSum == rightSum) {
				return arr[i];
			}
		}
		return -1;
	}
}
