package L3_Jan5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jan-2020
 *
 */

public class Case {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		char ch = scn.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("upper");
		} else {
			System.out.println("invalid");
		}

	}
}
