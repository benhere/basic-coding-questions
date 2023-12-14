package ArraysProblems;

public class FindDuplicateOptimized {
	
	public static int findDuplicate(int[] arr) {
		int ans = 0;
		
		for(int i=0; i<arr.length; i++) {
			ans = ans^arr[i];
		}
		
		for(int i=0; i<arr.length-1; i++) {
			ans = ans^i;
		}
		return ans;
	}

}
