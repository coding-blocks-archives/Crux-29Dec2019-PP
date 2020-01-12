package L4_Jan11;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 11-Jan-2020
 *
 */

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = null;
		System.out.println(arr);

		arr = new int[5];
		System.out.println(arr);

		// length
		System.out.println(arr.length);

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[0]);

		// loop
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
			// arr[i] = 100;

		}

		// for (int i = arr.length - 1; i >= 0; i--) {
		// System.out.println(arr[i]);
		// }

		// enhanced for loop
		System.out.println(" -- EFL -- ");
		// forward only
		// read only
		for (int val : arr) {
			System.out.println(val);
			val = 100;
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		int[] arr1 = arr;
		arr1[2] = 100;

		System.out.println(arr[2]);

		int i = 0;
		int j = 2;

		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);

		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

		int[] other = new int[3];
		other[0] = 100;
		other[1] = 200;
		other[2] = 300;

		System.out.println(arr[0] + ", " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);
	}

	public static void Swap(int[] one, int[] two) {

		int temp = one[0];
		one[0] = two[0];
		two[0] = temp;

	}

	public static void Swap(int[] a, int i, int j) {
		System.out.println(a[i] + ", " + a[j]);

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

		System.out.println(a[i] + ", " + a[j]);
	}

	public static void Swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}
}
