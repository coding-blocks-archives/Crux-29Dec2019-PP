package L3_Jan5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jan-2020
 *
 */

public class Rotate {

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

		for (int r = 1; r <= rot; r = r + 1) {
			int rem = n % 10;
			int part = n / 10;

			int rotated = rem * (int) Math.pow(10, nod - 1) + part;

			n = rotated;
		}

		System.out.println(n);

	}
}
