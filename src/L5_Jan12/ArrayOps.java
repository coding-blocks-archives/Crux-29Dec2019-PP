package L5_Jan12;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 12-Jan-2020
 *
 */

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] a = takeInput();
		int[] a = { 10, 20, 30 };
		display(a);

		// System.out.println(maximum(a));
		// System.out.println(linearSearch(a, 400));
		// System.out.println(binarySearch(a, 40));

		// reverse(a);

		// rotate(a, 3);
		// int[] ans = inverse(a);

		// subarraySum2Loops(a);

		// display(ans);
		// subarray(a);

		// subset(a);

		coinToss(3);

	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			int val = scn.nextInt();
			arr[i] = val;
		}

		return arr;

	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static int maximum(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}

		return max;
	}

	public static int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {
				return i;
			}
		}

		return -1;

	}

	public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (item > arr[mid]) {
				lo = mid + 1;
			} else if (item < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

	public static void reverse(int[] arr) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;

			lo++;
			hi--;

		}

		// for(int i=0 ; i < arr.length/2 ; i++) {
		//
		// int temp = arr[i] ;
		// arr[i] = arr[arr.length-1-i] ;
		// arr[arr.length-1-i] = temp ;
		// }
	}

	public static void rotate(int[] arr, int rot) {

		rot = rot % arr.length;

		if (rot < 0) {
			rot = rot + arr.length;
		}

		for (int r = 1; r <= rot; r++) {

			int temp = arr[arr.length - 1];

			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}

			arr[0] = temp;

		}

	}

	public static int[] inverse(int[] arr) {

		int[] inv = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			inv[arr[i]] = i;
		}

		return inv;
	}

	public static void subarrayPrint(int[] arr) {

		for (int si = 0; si < arr.length; si++) {

			for (int ei = si; ei < arr.length; ei++) {

				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void subarraySum3Loops(int[] arr) {

		for (int si = 0; si < arr.length; si++) {

			for (int ei = si; ei < arr.length; ei++) {

				int sum = 0;
				for (int k = si; k <= ei; k++) {
					sum = sum + arr[k];
				}

				System.out.println(sum);
			}
		}

	}

	public static void subarraySum2Loops(int[] arr) {

		for (int si = 0; si < arr.length; si++) {

			int sum = 0;

			for (int ei = si; ei < arr.length; ei++) {

				sum += arr[ei];

				System.out.println(si + "-" + ei + " : " + sum);
			}
		}
	}

	public static void subset(int[] arr) {

		int limit = (int) Math.pow(2, arr.length);

		for (int n = 0; n < limit; n++) {

			int temp = n;

			// to find binary
			for (int i = 0; i <= arr.length - 1; i++) {

				int rem = temp % 2;

				if (rem == 1) {
					System.out.print(arr[i] + " ");
				}

				temp = temp / 2;

			}

			System.out.println();
		}

	}

	public static void coinToss(int tt) {

		int limit = (int) Math.pow(2, tt);

		for (int n = 0; n < limit; n++) {

			int temp = n;

			// to find binary
			for (int i = 0; i < tt; i++) {

				int rem = temp % 2;

				if (rem == 1) {
					System.out.print("T");
				} else {
					System.out.print("H");
				}

				temp = temp / 2;

			}

			System.out.println();
		}

	}

}
