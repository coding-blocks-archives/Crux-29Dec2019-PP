package L1_Dec29;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int a = 0;
		int b = 1;

		int i = 1;

		while (i <= n + 1) {

			int sum = a + b;

			System.out.print(a + " ");

			// update
			a = b;
			b = sum;

			i = i + 1;
		}

	}

}
