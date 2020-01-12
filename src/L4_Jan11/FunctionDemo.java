package L4_Jan11;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 11-Jan-2020
 *
 */

public class FunctionDemo {

	static int val = 100;

	public static void main(String[] args) {

		System.out.println("hi");

		System.out.println("----------- Case 1 -----------");
		// fxn call
		addition();
		subtraction();

		System.out.println("----------- Case 2 -----------");
		int a = 10;
		int b = 20;

		additionParams(a, b);

		System.out.println("----------- Case 3 -----------");
		int c = additionReturn(a, b);
		System.out.println(c);

		System.out.println(additionReturn(a, b) + 7);

		System.out.println("----------- Case 4 -----------");
		int one = 10, two = 20;
		int sum = DemoScopes(one, two);
		System.out.println(sum);

		System.out.println("bye");

		System.out.println("----------- Case 5 -----------");
		System.out.println(one + ", " + two);
		Swap(one, two);
		System.out.println(one + ", " + two);

		System.out.println("----------- Case 6 -----------");
		System.out.println(val);
		int val = 200;
		System.out.println(val);
		System.out.println(FunctionDemo.val);

		val++;

		FunctionDemo.val++;

		System.out.println(val);
		System.out.println(FunctionDemo.val);

		DemoGlobalScopes(10);

		System.out.println(val);
		System.out.println(FunctionDemo.val);

	}

	public static int DemoGlobalScopes(int one) {

		int val = 600;
		val++;

		FunctionDemo.val += one;

		return val;
	}

	public static void Swap(int one, int two) {

		System.out.println(one + ", " + two);

		int temp = one;
		one = two;
		two = temp;

		System.out.println(one + ", " + two);
	}

	public static int DemoScopes(int one, int another) {

		int sum = one + another;
		return sum;

	}

	public static int additionReturn(int a, int b) {

		int sum = a + b;
		return sum;

	}

	public static void additionParams(int c, int d) {

		int sum = c + d;
		System.out.println(sum);

	}

	// fxn definition
	public static void addition() {

		int a = 10;
		int b = 20;

		int sum = a + b;

		subtraction();

		System.out.println(sum);
	}

	public static void subtraction() {

		int a = 100;
		int b = 30;

		int sub = a - b;

		System.out.println(sub);
	}

}
