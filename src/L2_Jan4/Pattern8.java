package L2_Jan4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jan-2020
 *
 */

public class Pattern8 {

	public static void main(String[] args) {

		int n =9;

		// logic
		int row = 1;

		while (row <= n) {

			int col = 1;
			while (col <= n) {

				if (row == col || row + col == n + 1)
					System.out.print("*");
				else
					System.out.print(" ");

				col = col + 1;
			}

			// prep
			System.out.println();
			row = row + 1;

		}

	}
}
