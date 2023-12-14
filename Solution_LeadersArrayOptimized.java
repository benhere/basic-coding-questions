package ArraysProblems;

import java.util.ArrayList;

public class Solution_LeadersArrayOptimized {
	
	public static ArrayList<Integer> findLeaders(int[] arr){
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		int maxTillNow = arr[arr.length-1];
		ans.add(maxTillNow);
		
		for(int i = arr.length-2; i>=0; i--) {
			if(arr[i] >= maxTillNow) {
				ans.add(arr[i]);
				maxTillNow = arr[i];
			}
		}
		return ans;
	}
}
