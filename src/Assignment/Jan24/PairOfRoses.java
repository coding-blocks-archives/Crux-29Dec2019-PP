package Assignment.Jan24;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {

			int n = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			Arrays.sort(arr);
			int target = scn.nextInt();

			printPairs(arr, target);

			t--;
		}
	}

	public static void printPairs(int[] arr, int target) {

		int i = 0, j = arr.length - 1;

		int ans1 = 0;
		int ans2 = 0;

		while (i < j) {

			int sum = arr[i] + arr[j];

			if (sum > target) {
				j--;
			} else if (sum < target) {
				i++;
			} else {
				ans1 = arr[i];
				ans2 = arr[j];
				i++;
				j--;
			}

		}

		System.out.println("Deepak should buy roses whose prices are " + ans1 + " and " + ans2 + ".");
	}

}
