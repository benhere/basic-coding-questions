package ArraysProblems;

public class Solution_Sort012 {
	
	public static void sort012(int[] arr) {
		
		int cnt0 = 0, cnt1 = 0, cnt2 = 0;
		
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i] == 0) {
				cnt0++;
			}else if(arr[i] == 1) {
				cnt1++;
			}else {
				cnt2++;
			}
		}
		
		int i = 0;
		
		// fill array with respective counts
		while(cnt0>0) {
			arr[i++] = 0;
			cnt0--;
		}
		
		while(cnt1>0) {
			arr[i++] = 1;
			cnt1--;
		}
		
		while(cnt2>0) {
			arr[i++] = 2;
			cnt2--;
		}
	}
}
