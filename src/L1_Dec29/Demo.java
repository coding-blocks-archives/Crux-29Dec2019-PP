package L1_Dec29;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		// System.out.println("The no is"+ n);

		System.out.println("Hello world");

		int a = 5;

		System.out.println(a);

		System.out.println(7 / 5);
		System.out.println(7 % 5);

		int temp = 10;
		int att = 40;

		if (temp >= 100 || att > 40) {
			System.out.println("Excellent");
		} else if (temp >= 50) {
			System.out.println("Average");
		} else {
			System.out.println("Poor");
		}

		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");

		// While

		int cnt = 1;

		while (cnt <= 5) {

			System.out.println("hello World");

			cnt = cnt + 1;
		}

	}

}
