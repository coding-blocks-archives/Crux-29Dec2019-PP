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

		int[] arr = { 10, 20, 30 };
		displayArray(arr, 0);
		System.out.println();

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

	public static int maximumArray(int[] arr) {

	}

	public static findFirstIndex(int[] arr) {
		
	}

}
