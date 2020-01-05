package L3_Jan5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jan-2020
 *
 */

public class Inverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int ans = 0;
		int pos = 1;

		while (n > 0) {

			int rem = n % 10;

			ans = ans + pos * (int) Math.pow(10, rem - 1);

			pos = pos + 1;
			n = n / 10;
		}

		System.out.println(ans);

	}
}



