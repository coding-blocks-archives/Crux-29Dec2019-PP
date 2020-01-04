package L2_Jan4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jan-2020
 *
 */

public class Pattern2 {

	public static void main(String[] args) {

		int n = 10;

		int row = 1;
		int nst = 1;

		// rows
		while (row <= n) {

			// work
			int col = 1;
			while (col <= nst) {
				System.out.print("*");
				col = col + 1;
			}

			// prep
			System.out.println();
			row = row + 1;
			nst = nst + 1;

		}
	}
}
