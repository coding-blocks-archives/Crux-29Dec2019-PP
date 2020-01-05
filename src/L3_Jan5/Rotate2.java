package L3_Jan5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jan-2020
 *
 */

public class Rotate2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int rot = scn.nextInt();

		// number of digits
		int nod = 0;

		int temp = n;
		while (temp > 0) {
			temp = temp / 10;
			nod = nod + 1;
		}

		rot = rot % nod;

		if (rot < 0) {
			rot = rot + nod;
		}

		// logic here ...
		int divisor = (int) Math.pow(10, rot);
		int multiplier = (int) Math.pow(10, nod - rot);

		int rem = n % divisor;
		int part = n / divisor;

		int ans = rem * multiplier + part;

		System.out.println(ans);

	}
}






