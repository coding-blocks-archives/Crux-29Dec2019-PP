package L4_Jan11;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 11-Jan-2020
 *
 */

public class FunctionOps {

	public static void main(String[] args) {

		int lo = 1;
		int hi = 1000;

		printArmstrong(lo, hi);
	}

	public static void printPrimes(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {

			boolean res = isPrime(i);

			if (res) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {

		int cnt = 0;
		int div = 1;

		while (div <= n) {

			if (n % div == 0) {
				cnt = cnt + 1;
			}
			div = div + 1;
		}

		if (cnt == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void printArmstrong(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {

			boolean res = isArmstrong(i);

			if (res) {
				System.out.println(i);
			}
		}

	}

	public static boolean isArmstrong(int n) {

		int nod = numberOfDigits(n);
		int sum = 0;

		int on = n;

		while (n > 0) {

			int rem = n % 10;
			sum += Math.pow(rem, nod);
			n = n / 10;
		}

		if (sum == on) {
			return true;
		} else {
			return false;
		}

	}

	public static int numberOfDigits(int n) {

		int count = 0;

		while (n > 0) {

			n = n / 10;
			count++;

		}

		return count;

	}

	
}
