package L2_Jan4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jan-2020
 *
 */

public class Pattern27 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;

		int nsp = n - 1;
		int nst = 1;

		int val = 1;

		while (row <= n) {

			// work
			val = row;

			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + "\t");
				
				if (cst <= nst / 2)
					val = val + 1;
				else
					val = val - 1;
				
				cst = cst + 1;
			}

			// prep
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;

		}

	}
}
