package ArraysProblems;

public class Solution_FindUniqueOptimized {
	
	public static int findUnique(int[] arr) {
		int uniqueNo = 0;
		for(int i=0; i<arr.length; i++) {
			uniqueNo = arr[i]^uniqueNo;
		}
		return uniqueNo;
	}
}
