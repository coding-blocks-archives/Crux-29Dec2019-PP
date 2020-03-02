package L16_Feb29;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-Feb-2020
 *
 */

public class FxnOverloading {

	public static void main(String[] args) {

		sum(2, 3);
		// int ans = sum(3, 4);
		// sum(2,3,4) ;
		// sum(2, 5.5);

		sum(3, 2, 5, 6);
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void sum(int a, int b, int c) {

		System.out.println("in 3 args");
		System.out.println(a + b + c);
	}

	public static void sum(int a, double b) {
		System.out.println(a + b);
	}

	public static void sum(int a, int b, int... args) {

		System.out.println("in var args");
		for (int val : args) {
			System.out.println(val);
		}

		// System.out.println(args[0]);
		// System.out.println(args[1]);
	}

}
