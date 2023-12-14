package ArraysProblems;

public class Solution_ArrayIntersection {
	
	public static void findArrayIntersection(int[] arr1, int[] arr2){
		
		// boundary checks
		if(arr1.length == 0 || arr2.length == 0) {
			return;
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j] && arr1[i] != -1) {
					System.out.print(arr1[i]+" ");
					arr1[i] = -1;
					arr2[j] = -1;
				}
			}
		}
	}
}
