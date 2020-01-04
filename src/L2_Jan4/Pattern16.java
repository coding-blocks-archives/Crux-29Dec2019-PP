package L2_Jan4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jan-2020
 *
 */

public class Pattern16 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		int nst = n;
		int nsp = n - 1;

		while (row <= 2 * n - 1) {
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

			if (row <= n - 1) {
				nst = nst - 1;
				nsp = nsp - 1;
			} else {
				nst = nst + 1;
				nsp = nsp + 1;
			}

			row = row + 1;

		}

	}
}
