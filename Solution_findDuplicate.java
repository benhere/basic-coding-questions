package ArraysProblems;

public class Solution_findDuplicate {
	
	public static int findDuplicate(int[] arr) {
		
		int f = 0;
		int i,j;
		
		for(i=1; i<arr.length; i++) {
			for(j=0; j<arr.length; j++) {
				if(i == j) {
					continue;
				}
				if(arr[i] == arr[j]) {
					f = 1;
					break;
				}
			}
			if(f == 1) {
				break;
			}
		}
		return arr[i];
	}
}
