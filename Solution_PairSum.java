package ArraysProblems;

public class Solution_PairSum {
	
	public static int findPairSum(int[] arr, int x) {
		int pair=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i == j) {
					continue;
				}
				if(arr[i]+arr[j] == x) {
					pair++;
				}
			}
		}
		return pair/2;
	}
}
