package Assignment.Jan24;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		Arrays.sort(arr);

		printPairs(arr, target);
		// print3Pairs(arr, 10);
	}

	public static void printPairs(int[] arr, int target) {

		int i = 0, j = arr.length - 1;

		while (i < j) {

			int sum = arr[i] + arr[j];

			if (sum > target) {
				j--;
			} else if (sum < target) {
				i++;
			} else {
				System.out.println(arr[i] + " " + arr[j]);
				i++;
				j--;
			}

		}
	}

	public static void print3Pairs(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			int j = i + 1;
			int k = arr.length - 1;

			while (j < k) {

				int sum = arr[i] + arr[j] + arr[k];

				if (sum > target) {

					k--;
				} else if (sum < target) {
					j++;
				} else {

					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					j++;
					k--;
				}

			}

		}
	}

}
