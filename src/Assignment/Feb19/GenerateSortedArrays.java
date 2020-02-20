package Assignment.Feb19;

import java.util.Scanner;

public class GenerateSortedArrays {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		int[] A = new int[n];
		int[] B = new int[m];

		for (int i = 0; i < n; i++)
			A[i] = scn.nextInt();

		for (int j = 0; j < m; j++)
			B[j] = scn.nextInt();

		int[] C = new int[A.length + B.length];
		generate(A, 0, B, 0, C, 0, false);
	}

	public static void generate(int[] A, int i, int[] B, int j, int[] C, int len, boolean isA) {

		if (!isA) {

			if (len != 0) {
				printArray(C, len);
			}

			for (int k = i; k < A.length; k++) {

				if (len == 0) {

					C[len] = A[k];
					generate(A, k + 1, B, j, C, len, true);
				} else {

					if (C[len] < A[k]) {

						C[len + 1] = A[k];
						generate(A, k + 1, B, j, C, len + 1, true);
					}

				}
			}

		} else {

			for (int k = j; k < B.length; k++) {

				if (B[k] > C[len]) {
					C[len + 1] = B[k];

					generate(A, i, B, k + 1, C, len + 1, false);
				}
			}

		}

	}

	public static void printArray(int[] C, int len) {

		for (int i = 0; i <= len; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println();
	}

}
