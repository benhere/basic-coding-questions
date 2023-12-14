package ArraysProblems;

import java.util.Arrays;

public class Solution_ArrayElementsFrequency {
	
	public static void countArrayElemetntsFrequency(int[] arr) {
		int n = arr.length;
		
		boolean isVisited[] = new boolean[n];
		Arrays.fill(isVisited, false);
		
		for(int i=0; i<n; i++)
		{
			//if array's element is already visited then skip it
			if(isVisited[i] == true) {
				continue;
			}
			int count = 1;  //array'e element will appear atleast once
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					isVisited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i]+":"+count);
		}
	}

}
