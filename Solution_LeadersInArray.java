package ArraysProblems;

public class Solution_LeadersInArray {
	
	public static void PrintLeadersInArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int j;
			for(j=i+1; j<arr.length; j++) {
				if(arr[i] <= arr[j]) {
					break;
				}
			}
			if(j == arr.length) {
				System.out.print(arr[i] +" ");
			}
		}
	}

}