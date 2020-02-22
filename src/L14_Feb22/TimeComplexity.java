package L14_Feb22;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Feb-2020
 *
 */

public class TimeComplexity {

	public static void main(String[] args) {

		// System.out.println(polymomial(3, 5));
		// System.out.println(power(2, 10));

		System.out.println(countPalindromicSS("nitinn"));

	}

	public static int polymomial(int x, int n) {

		int mult = x;
		int sum = 0;

		for (int coeff = n; coeff >= 1; coeff--) {
			sum += coeff * mult;
			mult = mult * x;
		}

		return sum;

	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int rr = power(x, n / 2);
		if (n % 2 == 0) {
			return rr * rr;
		} else {
			return rr * rr * x;
		}
	}

	public static int countPalindromicSS(String str) {

		int count = 0;

		// odd length palindromic ss
		for (int axis = 0; axis < str.length(); axis++) {

			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}

		}

		// even length palindromic ss
		for (double axis = 0.5; axis < str.length(); axis++) {

			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}
			}

		}

		return count;
	}

}
