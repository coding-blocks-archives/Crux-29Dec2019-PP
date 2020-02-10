package Assignment.Jan24;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			System.out.println(maxCircularSum(arr));

		}

	}

	public static int maxCircularSum(int[] arr) {

		int normal_ans = kadane(arr);
		int total_sum = 0;

		for (int i = 0; i < arr.length; i++) {

			total_sum += arr[i];
			arr[i] = -arr[i];
		}

		int non_wrap_ele = kadane(arr);

		int res = total_sum + non_wrap_ele;

		return Math.max(res, normal_ans);

	}

	public static int kadane(int[] arr) {

		int curr_sum = 0;
		int max_sum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			curr_sum += arr[i];
			max_sum = Math.max(max_sum, curr_sum);

			if (curr_sum < 0) {
				curr_sum = 0;
			}

		}

		return max_sum;

	}

}
