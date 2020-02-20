package Assignment.Feb19;

import java.util.Scanner;

public class KSwaps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		System.out.println(swaps(str.toCharArray(), 0, k));
	}

	public static int swaps(char[] charray, int vidx, int k) {

		int max = Integer.parseInt(new String(charray));

		if (k == 0 || vidx == charray.length) {
			return max;
		}

		char nextMax = maxInRestArray(charray, vidx);

		for (int i = vidx; i < charray.length; i++) {

			if (nextMax == charray[vidx]) {

				return swaps(charray, vidx + 1, k);
			} else {
				if (charray[i] == nextMax) {

					swap(charray, vidx, i);
					int rr = swaps(charray, vidx + 1, k - 1);
					swap(charray, vidx, i);

					max = Math.max(max, rr);
				}
			}
		}

		return max;

	}

	public static void swap(char[] charray, int i, int j) {

		char temp = charray[i];
		charray[i] = charray[j];
		charray[j] = temp;
	}

	public static char maxInRestArray(char[] charray, int i) {

		if (i >= charray.length) {
			return '%';
		}

		char maxChar = charray[i];

		while (i < charray.length) {

			if (maxChar < charray[i]) {
				maxChar = charray[i];
			}

			i++;
		}

		return maxChar;

	}

}
