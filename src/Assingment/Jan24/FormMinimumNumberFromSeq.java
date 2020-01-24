package Assingment.Jan24;

import java.util.Scanner;

public class FormMinimumNumberFromSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			String str = scn.next();
			minimum(str);
		}
	}

	public static void minimum(String str) {

		int[] res = new int[str.length() + 1];

		int number = 1;

		for (int i = 0; i <= str.length(); i++) {

			if (i == str.length() || str.charAt(i) == 'I') {

				res[i] = number++;

				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {

					res[j] = number++;
				}
			}

		}

		for (int val : res)
			System.out.print(val);

		System.out.println();
	}

}
