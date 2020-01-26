package L8_Jan25;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Jan-2020
 *
 */

public class StringBuilderOps {

	public static void main(String[] args) {

		System.out.println(lowerHigherAscii2("wdEf"));
	}

	public static String lowerHigherAscii(String str) {

		StringBuilder sb = new StringBuilder(str);

		// logic ...
		for (int i = 0; i < sb.length(); i++) {

			char ch = sb.charAt(i);

			if (i % 2 == 0) {
				sb.setCharAt(i, --ch);
			} else {
				sb.setCharAt(i, ++ch);
			}
		}

		return sb.toString();

	}

	public static String lowerHigherAscii2(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (i % 2 == 0) {
				sb.append(--ch);
			} else {
				sb.append(++ch);
			}
		}

		return sb.toString();

	}

}
