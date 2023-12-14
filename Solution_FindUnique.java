package ArraysProblems;

public class Solution_FindUnique {
	
	public static int findUnique(int[] arr) {
		int i,j;
		
		for(i=0; i<arr.length-1; i++)
		{
			int f = 0;
			for(j=0; j<arr.length; j++)
			{
				if(i == j) {
					continue;
				}
				if(arr[i] == arr[j]) {
					f++;
					break;
				}
			}
			if(f == 0) {
				break;
			}
		}
		return arr[i];
	}

}
