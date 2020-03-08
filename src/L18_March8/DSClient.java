package L18_March8;

import L16_Feb29.Stack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 08-Mar-2020
 *
 */

public class DSClient {

	public static void main(String[] args) throws Exception {

		Stack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		// ds.push(50);
		// ds.push(60);

		// System.out.println(ds.pop());
		// System.out.println(ds.pop());

		// ds.push(70);
		// ds.push(80);

		System.out.println("---- Display Reverse ----");
		ds.display(); // 40 30 20 10
		displayReverse(ds); // 10 20 30 40
		ds.display(); // 40 30 20 10

		System.out.println("---- Actual Reverse ----");
		ds.display(); // 40 30 20 10
		actualReverse(ds, new DynamicStack());
		ds.display(); // 10 20 30 40

		System.out.println(" -- NGE --");
		int[] arr = { 50, 20, 10, 40, 30, 60, 15, 12 };
		nextGreaterElement(arr);

		// System.out.println(" -- Stock Span -- ");
		// int[] a = { 90, 60, 15, 70, 45, 25, 50, 100, 5, 30, 80 };

	}

	public static void displayReverse(Stack s) throws Exception {

		if (s.isEmpty()) {
			return;
		}

		int temp = s.pop();

		displayReverse(s);
		System.out.println(temp);
		s.push(temp);

	}

	public static void actualReverse(Stack s, Stack other) throws Exception {

		if (s.isEmpty()) {
			actualReverseHelper(s, other);
			return;
		}

		int temp = s.pop();
		other.push(temp);

		actualReverse(s, other);

	}

	public static void actualReverseHelper(Stack s, Stack other) throws Exception {

		if (other.isEmpty()) {
			return;
		}

		int temp1 = other.pop();
		actualReverseHelper(s, other);
		s.push(temp1);

	}

	public static void nextGreaterElement(int[] arr) {

		java.util.Stack<Integer> s = new java.util.Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && s.peek() < arr[i]) {
				System.out.println(s.pop() + " -> " + arr[i]);
			}

			s.push(arr[i]);
		}

		while (!s.isEmpty()) {
			System.out.println(s.pop() + " -> -1");
		}

	}

	public static void stockSpan(int[] arr) {

	}
}
