package L7_Jan19;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Jan-2020
 *
 */

public class StringOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// String str = scn.next();

		// printChar(str);

		// substrings(str);

		System.out.println(palindromicSubstringsCount("nitin"));
	}

	public static void printChar(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

	public static boolean isPalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}

	public static boolean isPalindromeReverse(String str) {

		// reverse
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}

		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}

	}

	public static void substrings(String str) {

		for (int si = 0; si <= str.length() - 1; si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				String val = str.substring(si, ei);

				System.out.println(val);
			}
		}
	}

	public static int palindromicSubstringsCount(String str) {

		int count = 0;

		for (int si = 0; si <= str.length() - 1; si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				String val = str.substring(si, ei);

				if (isPalindrome(val)) {
					count++;
				}
			}
		}

		return count;
	}

}
