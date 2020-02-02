package L10_Feb2;

import L9_Feb1.RecursionGet;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2020
 *
 */

public class RecursionPrint {

	public static void main(String[] args) {

//		printSS("abc", "");
		printKPC("145", "");
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

		if(ques.length() == 0) {
			System.out.println(ans);
			return ;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String code = RecursionGet.getCode(ch);

		for (int i = 0; i < code.length(); i++) {
			printKPC(roq, ans + code.charAt(i));
		}

	}

}






