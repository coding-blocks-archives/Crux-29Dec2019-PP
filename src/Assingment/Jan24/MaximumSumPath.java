package Assingment.Jan24;

import java.util.Scanner;

public class MaximumSumPath {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();
			int m = scn.nextInt();

			int[] one = new int[n];
			int[] two = new int[m];

			for (int i = 0; i < n; i++)
				one[i] = scn.nextInt();
			for (int i = 0; i < m; i++)
				two[i] = scn.nextInt();

			System.out.println(maxSum(one, two));
		}
	}

	public static int maxSum(int[] one, int[] two) {

		int i = 0, j = 0;

		int sum1 = 0, sum2 = 0, res = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				sum1 += one[i];
				i++;
			} else if (one[i] > two[j]) {
				sum2 += two[j];
				j++;
			} else {

				res += Math.max(sum1, sum2) + one[i];
				i++;
				j++;

				sum1 = 0;
				sum2 = 0;

			}

		}

		while (i < one.length) {
			sum1 += one[i];
			i++;
		}

		while (j < two.length) {
			sum2 += two[j];
			j++;
		}

		res += Math.max(sum1, sum2);
		return res;

	}

}
