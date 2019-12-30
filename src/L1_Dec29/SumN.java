package L1_Dec29;

import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int cnt = 1;
		int sum = 0;

		while (cnt <= n) {

			sum = sum + cnt;
			cnt = cnt + 1;
		}

		System.out.println(sum);

	}

}
