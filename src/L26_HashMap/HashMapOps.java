package L26_HashMap;

import java.util.HashMap;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 *
 */

public class HashMapOps {

	public static void main(String[] args) {

		// System.out.println(maxFreqChar("abcdaabbbbbc"));

		// int[] one = { 50, 50, 50, 20, 10, 40, 70, 20 };
		// int[] two = { 50, 20, 20, 90, 20, 40, 40 };
		//
		// intersection(one, two);

		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 , 7 };

		longestConsecutiveSeq(arr);
	}

	public static char maxFreqChar(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		// frequency map create
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// if (map.containsKey(ch)) {
			//
			// int of = map.get(ch);
			// int nf = of + 1;
			// map.put(ch, nf);
			//
			// } else {
			// map.put(ch, 1);
			// }

			int of = map.getOrDefault(ch, 0);
			map.put(ch, of + 1);

		}

		int maxFreq = 0;
		char maxFreqChar = ' ';

		// char with max frequency
		for (char key : map.keySet()) {

			int val = map.get(key);

			if (val > maxFreq) {
				maxFreq = val;
				maxFreqChar = key;
			}

		}

		return maxFreqChar;

	}

	public static void intersection(int[] one, int[] two) {

		HashMap<Integer, Integer> map = new HashMap<>();

		// create a frequency map using one array
		for (int key : one) {

			int of = map.getOrDefault(key, 0);
			map.put(key, of + 1);

		}

		// traverse over the 2nd array and find out the common elements
		for (int key : two) {

			if (map.containsKey(key) && map.get(key) > 0) {
				System.out.println(key);
				map.put(key, map.get(key) - 1);
			}
		}
	}

	public static void longestConsecutiveSeq(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int val : arr) {

			if (map.containsKey(val - 1)) {
				map.put(val, false);
			} else {
				map.put(val, true);
			}

			if (map.containsKey(val + 1)) {
				map.put(val + 1, false);
			}

		}

		int longestLength = Integer.MIN_VALUE;
		int seqStarting = 0;

		for (Integer key : map.keySet()) {

			if (map.get(key)) {

				int count = 0;

				while (map.containsKey(key + count)) {
					count++;
				}

				if (count > longestLength) {
					longestLength = count;
					seqStarting = key;
				}

			}
		}

		for (int i = 0; i < longestLength; i++) {
			System.out.println(seqStarting + i);
		}

	}

}
