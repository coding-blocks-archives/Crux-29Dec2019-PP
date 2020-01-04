package L2_Jan4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jan-2020
 *
 */

public class Pattern1 {

	public static void main(String[] args) {

		int n = 3;

		// logic
		int row = 1;

		while (row <= n) {

			int col = 1;
			while (col <= n) {
				System.out.print("*");
				col = col + 1;
			}

			// prep
			System.out.println();
			row = row + 1;

		}

		System.out.println(row);
		

	}
}
