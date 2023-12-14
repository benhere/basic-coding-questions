package ArraysProblems;

import java.util.HashMap;
import java.util.Map;

public class Solution_ArrayElementsFrequencyOptimized {
	
	public static void countFrequency(int[] arr) {
		
		int size = arr.length;
		if(size == 0) {
			System.out.println("Empty Array!!!");
		}
		
		Map<Integer,Integer> mp = new HashMap<>();
		
		for(int i=0; i<size; i++)
		{
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]+1));
			}else {
				mp.put(arr[i], 1);
			}
		}
		
		// Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}
}
