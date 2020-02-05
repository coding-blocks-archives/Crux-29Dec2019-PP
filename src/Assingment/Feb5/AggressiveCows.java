package Assingment.Feb5;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int noc = 3;
		int nos = 5;
		int[] stalls = { 1, 2, 8, 4, 9 };

		Arrays.sort(stalls);
		int lo = 0;
		int hi = stalls[nos - 1] - stalls[0];

		int ans = 0;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(stalls, noc, mid)) {

				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}

		System.out.println(ans);

	}

	public static boolean isItPossible(int[] stalls, int noc, int min) {

		int cows = 1;
		int LastCowPlaced = stalls[0];

		for (int i = 1; i < stalls.length; i++) {

			if (stalls[i] - LastCowPlaced >= min) {
				cows++;
				LastCowPlaced = stalls[i];
			}

			if (cows == noc) {
				return true;
			}

		}

		return false;

	}

}
