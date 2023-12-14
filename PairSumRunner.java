package ArraysProblems;

import java.io.*;

public class PairSumRunner {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInput() throws NumberFormatException, IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] inputArr = new int[size];

		if (size == 0) {
			return inputArr;
		}

		String[] strNums;
		strNums = br.readLine().split("\\s");

		for (int i = 0; i < size; i++) {
			inputArr[i] = Integer.parseInt(strNums[i]);
		}

		return inputArr;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int tc = Integer.parseInt(br.readLine());

		while (tc > 0) {
			int[] inputArr = takeInput();
			int x = Integer.parseInt(br.readLine());
			System.out.println(Solution_PairSum.findPairSum(inputArr,x));	
			tc--;
		}
	}
}
