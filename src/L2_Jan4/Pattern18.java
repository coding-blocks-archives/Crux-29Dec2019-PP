package L2_Jan4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jan-2020
 *
 */

public class Pattern18 {

	public static void main(String[] args) {

		int n = 9;

		int row = 1;
		int nst = 1;
		int nsp = n / 2;

		while (row <= n) {
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prep
			System.out.println();

			if (row <= n / 2) {
				nst = nst + 2;
				nsp = nsp - 1;
			} else {
				nst = nst - 2;
				nsp = nsp + 1;
			}

			row = row + 1;

		}

	}
}
