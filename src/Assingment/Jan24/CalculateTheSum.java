package Assingment.Jan24;

import java.util.Scanner;

public class CalculateTheSum {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();

		}

		System.out.println(sum(arr));
	}

	public static int sum(int[] arr) {

		int q = scn.nextInt();

		int sum = 0;
		for (int val : arr) {
			sum += val;
		}

		return (int) (Math.pow(2, q) * sum) % 1_000_000_007;
	}

}
