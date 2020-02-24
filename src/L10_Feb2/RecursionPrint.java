package L10_Feb2;

import java.util.ArrayList;

import L9_Feb1.RecursionGet;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2020
 *
 */

public class RecursionPrint {

	public static void main(String[] args) {

		// printSS("abc", "");
		// printKPC("145", "");
		// permutation2("abc", "");
		// coinTossNoConsecutiveHead(3, "", false);

		// validParenthesis(3, 0, 0, "");
		// System.out.println(mazePath(0, 0, 2, 2, ""));
		// System.out.println(boardPath(0, 10, ""));
		// lexicoCounting(0, 1000);

		// palindromicPartition("abbcbc", "");
//		System.out.println(differentWaysToAddParenthesis("2*3-4*5"));
		
		System.out.println(differentWaysToAddParenthesis1("2*3+4*5")) ;
	}

	public static void printSS(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSS(roq, ans); // no
		printSS(roq, ans + ch); // yes

	}

	public static void printSSAscii(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSSAscii(roq, ans); // no
		printSSAscii(roq, ans + ch); // yes
		printSSAscii(roq, ans + (int) ch); // ascii

	}

	public static void printKPC(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String code = RecursionGet.getCode(ch);

		for (int i = 0; i < code.length(); i++) {
			printKPC(roq, ans + code.charAt(i));
		}

	}

	public static void permutation(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		for (int i = 0; i <= ans.length(); i++) {
			permutation(roq, ans.substring(0, i) + ch + ans.substring(i));
		}

	}

	public static void permutation2(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);

			permutation2(roq, ans + ch);
		}

	}

	public static void coinToss(int n, String ans) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}

		coinToss(n - 1, ans + "H");
		coinToss(n - 1, ans + "T");

	}

	public static void coinTossNoConsecutiveHead(int n, String ans, boolean isLastHeadIncluded) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if (isLastHeadIncluded) {
			coinTossNoConsecutiveHead(n - 1, ans + "T", false);
		} else {
			coinTossNoConsecutiveHead(n - 1, ans + "H", true);
			coinTossNoConsecutiveHead(n - 1, ans + "T", false);
		}
	}

	public static void validParenthesis(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (open > n || close > n || close > open) {
			return;
		}

		validParenthesis(n, open + 1, close, ans + "(");
		validParenthesis(n, open, close + 1, ans + ")");

	}

	public static int mazePath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return 1;
		}

		if (cc > ec || cr > er) {
			return 0;
		}

		int hc = mazePath(cr, cc + 1, er, ec, ans + "H");
		int vc = mazePath(cr + 1, cc, er, ec, ans + "V");

		return hc + vc;
	}

	public static int boardPath(int curr, int end, String ans) {

		if (curr == end) {
			System.out.println(ans);
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += boardPath(curr + dice, end, ans + dice);
		}

		return count;
	}

	public static void lexicoCounting(int curr, int end) {

		if (curr > end) {
			return;
		}

		System.out.println(curr);

		int i = 0;

		if (curr == 0)
			i = 1;

		while (i <= 9) {
			lexicoCounting(curr * 10 + i, end);
			i++;
		}

	}

	public static void palindromicPartition(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {

			String part = ques.substring(0, i);
			String roq = ques.substring(i);

			if (isPalindrome(part))
				palindromicPartition(roq, ans + part + " ");
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

	public static ArrayList<Integer> differentWaysToAddParenthesis(String ques) {

		ArrayList<Integer> mr = new ArrayList<>();

		if (ques.indexOf('+') == -1 && ques.indexOf('-') == -1 && ques.indexOf('*') == -1) {
			mr.add(Integer.parseInt(ques));
			return mr;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);

			if (ch == '+' || ch == '-' || ch == '*') {

				String p1 = ques.substring(0, i);
				String p2 = ques.substring(i + 1);

				ArrayList<Integer> rr1 = differentWaysToAddParenthesis(p1);
				ArrayList<Integer> rr2 = differentWaysToAddParenthesis(p2);

				for (int val1 : rr1) {
					for (int val2 : rr2) {

						if (ch == '+') {
							mr.add(val1 + val2);
						} else if (ch == '-') {
							mr.add(val1 - val2);
						} else if (ch == '*') {
							mr.add(val1 * val2);
						}
					}
				}
			}
		}

		return mr;

	}

	public static ArrayList<String> differentWaysToAddParenthesis1(String ques) {

		ArrayList<String> mr = new ArrayList<>();

		if (ques.indexOf('+') == -1 && ques.indexOf('-') == -1 && ques.indexOf('*') == -1) {
			mr.add(ques);
			return mr;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);

			if (ch == '+' || ch == '-' || ch == '*') {

				String p1 = ques.substring(0, i);
				String p2 = ques.substring(i + 1);

				ArrayList<String> rr1 = differentWaysToAddParenthesis1(p1);
				ArrayList<String> rr2 = differentWaysToAddParenthesis1(p2);

				for (String val1 : rr1) {
					for (String val2 : rr2) {

						mr.add("(" + val1 + ch + val2 + ")");

					}
				}
			}
		}

		return mr;

	}

}
