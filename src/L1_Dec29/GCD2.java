package L1_Dec29;

import java.util.Scanner;

public class GCD2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int dividend = scn.nextInt();
		int divisor = scn.nextInt();

		while (dividend % divisor != 0) {

			int rem = dividend % divisor;

			dividend = divisor;
			divisor = rem;

		}

		System.out.println(divisor);

	}

}
