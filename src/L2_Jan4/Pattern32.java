package L2_Jan4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jan-2020
 *
 */

public class Pattern32 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		int nst = 1;
		int start = 1;

		while (row <= 2 * n - 1) {

			int cst = 1;
			while (cst <= nst) {

				if (cst % 2 == 0)
					System.out.print("*");
				else
					System.out.print(start);

				cst = cst + 1;
			}

			// prep
			System.out.println();
			if (row <= n - 1) {
				nst = nst + 2;
				start = start + 1;
			} else {
				nst = nst - 2;
				start = start - 1;
			}

			row = row + 1;

		}

	}
}
