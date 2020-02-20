package Assignment.Feb19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodesOfString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println(codes(scn.next()));
	}

	public static ArrayList<String> codes(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");

			return br;
		}

		ArrayList<String> mr = new ArrayList<String>();
		String ch1 = str.substring(0, 1);
		String ros1 = str.substring(1);
		int digit1 = Integer.parseInt(ch1);

		ArrayList<String> rr1 = codes(ros1);
		char code1 = (char) ('a' + digit1 - 1);
		for (String val : rr1) {
			mr.add(code1 + val);
		}

		if (str.length() == 1) {
			return mr;
		}

		String ch2 = str.substring(0, 2);
		String ros2 = str.substring(2);

		int digit2 = Integer.parseInt(ch2);

		if (digit2 > 26) {
			return mr;
		}

		char code2 = (char) ('a' + digit2 - 1);
		ArrayList<String> rr2 = codes(ros2);

		for (String val : rr2) {
			mr.add(code2 + val);
		}

		return mr;

	}

	public static ArrayList<String> codes2(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");

			return br;
		}

		ArrayList<String> mr = new ArrayList<String>();

		for (int i = 1; i <= 2; i++) {
			if (i == 2 && str.length() == 1) {
				return mr;
			}

			String ch2 = str.substring(0, i);
			String ros2 = str.substring(i);

			int digit2 = Integer.parseInt(ch2);

			if (digit2 > 26) {
				return mr;
			}

			char code2 = (char) ('a' + digit2 - 1);
			ArrayList<String> rr2 = codes(ros2);

			for (String val : rr2) {
				mr.add(code2 + val);
			}
		}
		return mr;

	}

}
