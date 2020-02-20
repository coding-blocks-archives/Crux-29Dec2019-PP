package Assignment.Feb5;

public class Ruler {

	public static void main(String[] args) {
		ruler(2, 4);
	}

	public static void print(int n, int val) {

		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}

		if (val != -1) {
			System.out.println(val);
		} else
			System.out.println();
	}

	public static void printInterval(int n) {

		if (n == 0) {
			return;
		}

		printInterval(n - 1);
		print(n, -1);
		printInterval(n - 1);

	}

	public static void ruler(int inchs, int TickLength) {

		for (int i = 0; i < inchs; i++) {

			print(TickLength, i);
			printInterval(TickLength - 1);
		}

		print(TickLength, inchs);

	}

}
