package L8_Jan25;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Jan-2020
 *
 */

public class Recursion {

	public static void main(String[] args) {

		System.out.println("hi");
		// System.out.println(factorial(4));
		// System.out.println(power(2, 100000));
		// System.out.println(fibonacci(50));

		int[] arr = { 100, 5, 60, 30, 15, 30, 30 };
		// displayArray(arr, 0);
		// System.out.println(maximumArray(arr, 0));
		// System.out.println(findFirstIndex(arr, 0, 30));
		int[] res = findAllIndex(arr, 0, 30, 0);

		for (int val : res)
			System.out.println(val);
		// System.out.println();

		System.out.println("bye");
	}

	public static void PD(int n) {

		// base case
		if (n == 0) {
			return;
		}

		// self work
		System.out.println(n);

		// smaller problem
		PD(n - 1);

	}

	public static void PI(int n) {

		if (n == 0) {
			return;
		}

		System.out.println("hello " + n);

		// smaller problem
		PI(n - 1);

		// self work
		System.out.println("bye " + n);
	}

	public static int factorial(int n) {

		if (n == 1) {
			return 1;
		}

		int fnm1 = factorial(n - 1);
		int fn = fnm1 * n;

		return fn;

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int sp = power(x, n - 1);
		int sw = sp * x;

		return sw;
	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		int fn = fnm1 + fnm2;

		return fn;
	}

	public static void displayArray(int[] arr, int idx) {

		if (idx == arr.length) {
			return;
		}

		System.out.print(arr[idx] + " ");

		displayArray(arr, idx + 1);
	}

	public static void displayArrayRev(int[] arr, int idx) {

		if (idx == arr.length) {
			return;
		}

		displayArrayRev(arr, idx + 1);

		System.out.print(arr[idx] + " ");

	}

	public static int maximumArray(int[] arr, int idx) {

		if (idx == arr.length - 1) {
			return arr[idx];
		}

		int maxTillNow = maximumArray(arr, idx + 1);

		if (arr[idx] > maxTillNow) {
			return arr[idx];
		} else {
			return maxTillNow;
		}

	}

	public static int findFirstIndex(int[] arr, int idx, int item) {

		if (idx == arr.length) {
			return -1;
		}

		if (arr[idx] == item) {
			return idx;
		}

		int res = findFirstIndex(arr, idx + 1, item);

		return res;
	}

	public static int findLastIndex(int[] arr, int idx, int item) {

		if (idx == arr.length) {
			return -1;
		}

		int rr = findLastIndex(arr, idx + 1, item);

		if (arr[idx] == item && rr == -1) {
			return idx;
		}

		return rr;
	}

	public static int findLastIndex2(int[] arr, int idx, int item, int temp) {

		if (idx == arr.length) {
			return temp;
		}

		if (arr[idx] == item) {
			temp = idx;
		}

		int rr = findLastIndex2(arr, idx + 1, item, temp);
		return rr;
	}

	public static int[] findAllIndex(int[] arr, int idx, int item, int count) {

		if (idx == arr.length) {
			int[] br = new int[count];
			return br;
		}

		if (arr[idx] == item) {
			int[] rr = findAllIndex(arr, idx + 1, item, count + 1);
			rr[count] = idx;
			return rr;
		} else {
			int[] rr = findAllIndex(arr, idx + 1, item, count);
			return rr;
		}

	}
}
