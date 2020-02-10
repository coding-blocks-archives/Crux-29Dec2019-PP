package Assignment.Jan24;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int nst = 1;
		int row = 1;

		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print(nCr(row - 1, cst - 1) + " ");
				cst++;
			}
			System.out.println();
			row++;
			nst++;

		}

	}

	public static int nCr(int n, int r) {

		r = Math.min(r, n - r);
		int res = 1;

		for (int i = 0; i < r; i++) {

			res *= (n - i);
			res /= (i + 1);

		}

		return res;

	}

}
