package L8_Jan25;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Jan-2020
 *
 */

public class StringBuilderDemo {

	public static void main(String[] args) {

		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		sb.append("e");

		// length
		System.out.println(sb.length());

		// charAt
		System.out.println(sb.charAt(2));

		// print
		System.out.println(sb);

		// update
		sb.setCharAt(2, 'w');
		System.out.println(sb);

		// append
		sb.append("bye");
		System.out.println(sb);

		// insert
		sb.insert(sb.length(), "hi");
		System.out.println(sb);

		// remove
		sb.deleteCharAt(2);
		System.out.println(sb);

		String str = sb.toString();

		System.out.println(str);

	}

	public static String fun() {

		StringBuilder sb = new StringBuilder();

		sb.append(1);

		return sb.toString();
	}
}
