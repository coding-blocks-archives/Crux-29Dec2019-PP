package L6_Jan18;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 18-Jan-2020
 *
 */

public class Array2DOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[][] arr = takeInput() ;

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		display(arr);

		System.out.println("--- WAVE DISPLAY ---");
		waveDisplay(arr);

		System.out.println("--- SPIRAL DISPLAY ---");
		spiralDisplay(arr);

		System.out.println("--- Matrix Multiplication ---");
		int[][] one = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] two = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		display(matrixMultiplication(one, two));

	}

	public static int[][] takeInput() {

		System.out.println("Rows ?");
		int row = scn.nextInt();

		// create a jagged array
		int[][] arr = new int[row][];

		// loop on every row
		for (int r = 0; r < arr.length; r++) {

			// ask for cols in every row
			System.out.println("Cols for " + r + " row ?");
			int col = scn.nextInt();

			// instead of null point to some address
			arr[r] = new int[col];

			// update the 0 values
			for (int c = 0; c < arr[r].length; c++) {
				System.out.println("[" + r + " - " + c + "] ?");

				arr[r][c] = scn.nextInt();
			}

		}

		return arr;
	}

	public static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void waveDisplay(int[][] arr) {

		for (int c = 0; c < arr[0].length; c++) {

			if (c % 2 == 0) {

				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}

			} else {

				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}
			}
		}

		System.out.println();
	}

	public static void spiralDisplay(int[][] arr) {

		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;

		int total = arr.length * arr[0].length;
		int count = 0;

		while (count < total) {

			// first col
			for (int r = minRow; r <= maxRow && count < total; r++) {
				System.out.print(arr[r][minCol] + " ");
				count++;
			}
			minCol++;

			// last row
			for (int c = minCol; c <= maxCol && count < total; c++) {
				System.out.print(arr[maxRow][c] + " ");
				count++;
			}
			maxRow--;

			// last col
			for (int r = maxRow; r >= minRow && count < total; r--) {
				System.out.print(arr[r][maxCol] + " ");
				count++;
			}
			maxCol--;

			// first row
			for (int c = maxCol; c >= minCol && count < total; c--) {
				System.out.print(arr[minRow][c] + " ");
				count++;
			}
			minRow++;

		}

		System.out.println();

	}

	public static int[][] matrixMultiplication(int[][] one, int[][] two) {

		int r1 = one.length;
		int c1 = one[0].length;

		int r2 = two.length;
		int c2 = two[0].length;

		int[][] res = new int[r1][c2];

		for (int i = 0; i < res.length; i++) {

			for (int j = 0; j < res[0].length; j++) {

				int sum = 0;
				for (int k = 0; k < c1; k++) {
					int val = one[i][k] * two[k][j];
					sum += val;
				}

				res[i][j] = sum;
			}
		}

		return res;
	}

}
